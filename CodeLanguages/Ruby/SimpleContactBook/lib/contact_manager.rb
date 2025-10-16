# Built-in Ruby library to handle CSV (Used for saving/updating/editing contacts)
require 'csv'

# Represents a Single contact entry
class Contact
    attr_accessor :first_name, :last_name, :phone_number, :email, :mailing, :notes
    
    def initialize(first_name, last_name, phone_number, email, mailing, notes)
      @first_name = first_name
      @last_name = last_name
      @phone_number = phone_number
      @email = email
      @mailing = mailing
      @notes = notes
    end

    # Convert to hash for saving to CSV file
    def to_hash
      { first_name: @first_name, last_name: @last_name, phone_number: @phone_number, email: @email, mailing: @mailing, notes: @notes }
    end

    # Builds contact object from a hash loaded from CSV
    def self.from_hash(hash)
      Contact.new(hash["first_name"], hash["last_name"], hash["phone_number"], hash["email"], hash["mailing"], hash["notes"])
    end
end

# Manages the list of contacts and handles saving/loading
class ContactManager
  def initialize(file_path)
    @file_path = file_path
    @contacts = load_contacts # Loads contact list from file if it exists
  end

  def load_contacts
    
  end

  # Add contact method
  def add_entry(first_name, last_name, phone_number, email, mailing, notes)
    @contacts  << Contact.new(first_name, last_name, phone_number, email, mailing, notes)
    save_contacts
  end

  # Search contacts list
  def search_table(search_term)
    return [] unless File.exist?(@file_path)
    
    search_terms = search_term.split.map(&:downcase)
    matches = []
    
    CSV.foreach(@file_path, headers: true) do |row|
      row_hash = row.to_h
      
      found = if search_terms.length == 2
        # Two terms - assume first and last name
        first_name = row_hash["first_name"]&.downcase || ""
        last_name = row_hash["last_name"]&.downcase || ""
        
        # Check both combinations: "John Smith" or "Smith John"
        (first_name.include?(search_terms[0]) && last_name.include?(search_terms[1])) ||
        (first_name.include?(search_terms[1]) && last_name.include?(search_terms[0])) ||

        # Also check if both terms appear anywhere in the contact
        row_hash.values.compact.join(' ').downcase.include?(search_term.downcase)

      elsif search_terms.length > 2
        # Multiple terms - all must appear somewhere in the contact
        contact_text = row_hash.values.compact.join(' ').downcase
        search_terms.all? { |term| contact_text.include?(term) }

      else
        # Single term - original logic
        row_hash.values.any? { |value| value&.downcase&.include?(search_terms.first) }
      end
      
      matches << Contact.from_hash(row_hash) if found
    end
    matches
  end

  # Edit contact method
  def edit_contact(search_term)
  # Search for matching contacts (using in-memory search)
  search_terms = search_term.split.map(&:downcase)
  
  matches = @contacts.select do |contact|
    found = if search_terms.length == 2
      first_name = contact.first_name&.downcase || ""
      last_name = contact.last_name&.downcase || ""
      
      (first_name.include?(search_terms[0]) && last_name.include?(search_terms[1])) ||
      (first_name.include?(search_terms[1]) && last_name.include?(search_terms[0])) ||
      contact.to_hash.values.compact.join(' ').downcase.include?(search_term.downcase)
      
    elsif search_terms.length > 2
      contact_text = contact.to_hash.values.compact.join(' ').downcase
      search_terms.all? { |term| contact_text.include?(term) }
      
    else
      contact.to_hash.values.any? { |value| value&.to_s&.downcase&.include?(search_terms.first) }
    end
    
    found
  end
  
  if matches.empty?
    puts "No contacts found matching '#{search_term}'"
    return false
  end
  
  # Select contact if multiple matches
  contact_to_edit = select_contact_from_matches(matches)
  return false unless contact_to_edit
  
  # Show field selection menu
  loop do
    puts "\n" + "="*50
    puts "Editing: #{contact_to_edit.first_name} #{contact_to_edit.last_name}"
    puts "="*50
    
    fields = {
      '1' => { name: 'First Name', attr: :first_name, value: contact_to_edit.first_name },
      '2' => { name: 'Last Name', attr: :last_name, value: contact_to_edit.last_name },
      '3' => { name: 'Phone Number', attr: :phone_number, value: contact_to_edit.phone_number },
      '4' => { name: 'Email', attr: :email, value: contact_to_edit.email },
      '5' => { name: 'Mailing', attr: :mailing, value: contact_to_edit.mailing },
      '6' => { name: 'Notes', attr: :notes, value: contact_to_edit.notes },
      '7' => { name: 'Edit All Fields', attr: nil, value: nil },
      '0' => { name: 'Save and Exit', attr: nil, value: nil }
    }
    
    puts "Which field would you like to edit?"
    fields.each do |key, field|
      if key == '7' || key == '0'
        puts "#{key}. #{field[:name]}"
      else
        puts "#{key}. #{field[:name]}: #{field[:value]}"
      end
    end
    
    print "\nSelect option (0-7): "
    choice = gets.chomp
    
    case choice
    when '0'
      save_contacts
      puts "Contact saved successfully!"
      break
    when '1', '2', '3', '4', '5', '6'
      edit_single_field(contact_to_edit, fields[choice])
    when '7'
      edit_all_fields(contact_to_edit)
    else
      puts "Invalid selection. Please try again."
    end
  end
    private

    def select_contact_from_matches(matches)
      return matches.first if matches.length == 1
      
      puts "Multiple contacts found:"
      matches.each_with_index do |contact, index|
        puts "#{index + 1}. #{contact.first_name} #{contact.last_name} - #{contact.email}"
      end
      
      print "Select contact to edit (1-#{matches.length}): "
      choice = gets.chomp.to_i
      
      if choice.between?(1, matches.length)
        matches[choice - 1]
      else
        puts "Invalid selection"
        nil
      end
    end

    def edit_single_field(contact, field)
      current_value = contact.send(field[:attr])
      
      print "#{field[:name]} (current: #{current_value}): "
      new_value = gets.chomp
      
      unless new_value.empty?
        contact.send("#{field[:attr]}=", new_value)
        puts "#{field[:name]} updated!"
      else
        puts "No changes made to #{field[:name]}"
      end
    end

    def edit_all_fields(contact)
      puts "\nEditing all fields - Press Enter to keep current value:"
      
      fields = [
        { name: 'First Name', attr: :first_name },
        { name: 'Last Name', attr: :last_name },
        { name: 'Phone Number', attr: :phone_number },
        { name: 'Email', attr: :email },
        { name: 'Mailing', attr: :mailing },
        { name: 'Notes', attr: :notes }
      ]
      
      fields.each do |field|
        current_value = contact.send(field[:attr])
        print "#{field[:name]} (#{current_value}): "
        new_value = gets.chomp
        
        contact.send("#{field[:attr]}=", new_value) unless new_value.empty?
      end
      
      puts "All fields updated!"
    end
  end
end
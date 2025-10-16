# Link to class file
require_relative "lib/contact_manager"

# Set up manager and point to data file (csv)
manager = ContactManager.new('data/contactList.csv')

loop do
  # Print out list of available chosices to the user
  puts "\n== Contact List"
  puts "1. View Contacts"
  puts "2. Add Contact"
  puts "3. Search Contact"
  puts "4. Edit Contact"
  puts "5. Delete Contact"
  puts "6. Exit"
  print "Choose and option: "

  # Get user input and convert to integer
  choice = gets.chomp.to_i

  # Handle case matching for user input
  case choice
  when 1
    manager.list_contacts
  when 2
    print "Enter First Name: "
    first_name = gets.chomp
    print "Enter Last Name: "
    last_name = gets.chomp
    print "Enter Phone Number (eg. +1 123-456-7890): "
    phone_number = gets.chomp
    print "Enter Email Address: "
    email = gets.chomp
    print "Enter Mailing Address: "
    mailing = gets.chomp
    print "Enter any addition notes: "
    notes = gets.chomp

    manager.add_entry(first_name,last_name,phone_number,email,mailing,notes)
    print "Contacted Added Successfully!"
  when 3
    print "Enter search term: "
    search_term = gets.chomp
    manager.search_table(search_term)
  when 4
    print "Enter First and Last name of contact that you would like to edit (Eg. John Smith): "
    edit_contact = gets.chomp
    manager.edit_contact(edit_contact)
  when 5
    print "Enter first and last name of the contact you would like to delete: "
    del_name = gets.chomp
    manager.delete_contact(del_name)
  when 6
    puts "Closing Contact Book!"
    break
  else
    puts "Invalid optiom Try again."
  end
end
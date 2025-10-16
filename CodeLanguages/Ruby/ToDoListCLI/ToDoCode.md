Main Ruby Code File
```ruby
# Link to the class file
require_relative 'lib/task_manager'

# Set up manager and point it to your data file
manager = TaskManager.new('data/tasks.json')

# Basic CLI loop (allows for program to restart until exit option is selected)
loop do
  # Print out list of available choices to the user.
  puts "\n== To-Do List =="
  puts "1. View Tasks"
  puts "2. Add Task"
  puts "3. Complete Task"
  puts "4. Delete Task"
  puts "5. Exit"
  print "Choose an option: "

  # Get user input and convert to integer
  choice = gets.chomp.to_i

  # Handle case matching for user input
  case choice
  when 1
    manager.list_tasks
  when 2
    print "Enter task title: "
    title = gets.chomp
    manager.add_task(title)
    puts "Task added!"
  when 3
    manager.list_tasks
    print "Enter task number to mark complete: "
    index = gets.chomp.to_i
    manager.complete_task(index)
    puts "Task marked complete!"
  when 4
    manager.list_tasks
    print "Enter task number to delete: "
    index = gets.chomp.to_i
    manager.delete_task(index)
    puts "Task deleted!"
  when 5
    puts "Goodbye!"
    break # This will end the program but does not erase json file where tasks are stored
  else
    puts "Invalid option. Try again."
  end
end
```

Task Manager Code File
```ruby
# Built-in Ruby library to handle JSON (used for saving/loading tasks)
require 'json'

# Represents a single task
class Task
  attr_accessor :title, :completed

  def initialize(title, completed = false)
    @title = title
    @completed = completed
  end

  # Converts task to a hash for saving to JSON
  def to_hash
    { title: @title, completed: @completed }
  end

  # Builds a Task object from a hash loaded from JSON
  def self.from_hash(hash)
    Task.new(hash["title"], hash["completed"])
  end
end

# Manages the list of tasks and handles saving/loading
class TaskManager
  def initialize(file_path)
    @file_path = file_path
    @tasks = load_tasks  # Load tasks from file if it exists
  end

  # Add Task method
  def add_task(title)
    @tasks << Task.new(title)
    save_tasks
  end

  # List Tasks method
  def list_tasks
    puts "\nYour Tasks:"
    @tasks.each_with_index do |task, index|
      status = task.completed ? "[X]" : "[ ]"
      puts "#{index + 1}. #{status} #{task.title}"
    end
  end

  # Complete Task method
  def complete_task(index)
    task = @tasks[index - 1]
    task.completed = true if task
    save_tasks
  end

  # Delete Task method
  def delete_task(index)
    @tasks.delete_at(index - 1) # Removes task from json file 
    save_tasks
  end

  private

  # Save Tasks method
  def save_tasks
    data = @tasks.map(&:to_hash)  # Convert all tasks to hashes
    File.write(@file_path, JSON.pretty_generate(data))  # Save to file
  end

  # Load Tasks method
  def load_tasks
    return [] unless File.exist?(@file_path)
    content = File.read(@file_path)
    return [] if content.strip.empty?  # <- prevent parsing empty file
    data = JSON.parse(File.read(@file_path))  # Load from file
    data.map { |task_hash| Task.from_hash(task_hash) }
  end
end
```
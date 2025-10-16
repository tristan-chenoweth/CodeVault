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
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
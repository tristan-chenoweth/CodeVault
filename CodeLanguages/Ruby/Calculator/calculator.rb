# Define the calculate function that takes two numbers and an operator
def calculate(num1, num2, operator)
    # Use a case statement to determine which operation to perform
    case operator
    when 'a'
      num1 + num2  # Addition
    when 's'
      num1 - num2  # Subtraction
    when 'm'
      num1 * num2  # Multiplication
    when 'd'
      num2 != 0 ? (num1.to_f / num2) : "Error: Division by zero" # Division with check for division by zero
    when 'e'
      num1 ** num2  # Exponentiation
    when 'o'
      num1 % num2 # Modulus
    when 'f'
      def factorial(num1) # Factorial
        if num1 == 0 || num1 == 1
          1
        else
          num1 * factorial(num1-1)
        end
      end
      factorial(num1)
    else
      "Invalid operator"  # Return error message for invalid operators
    end
  end
  
  # Start an infinite loop for multiple calculations until Quit option is selected
  loop do
    # Display into message to user
    print "Welcome to Ruby Calculator!\n"
    # Prompt user for the operator listed by case
    print "Select operation:\n"
    print "a - addition\n"
    print "s - subtraction\n"
    print "m - Multiplication\n"
    print "d - Division\n"
    print "e - Expenentional\n"
    print "o - Modulus\n"
    print "f - Factorialize\n"
    print "r - Restart\n"
    print "q - Quit\n"
    print "Operation: "

    # Get the operator from user input
    operator = gets.chomp.downcase
    puts "Selected: #{operator}"

    # Break the loop if user enters 'q' or 'Q'
    break if operator.downcase == 'q' 

    if operator == 'r'
      print "Restarting Calculator...\n"
      next
    end

    if operator == 'f'
      # Setting num2 to 1 (it is ignored in factorial function but is needed to run calculate)
      num2 = 1
      # Get user input for factorial number and remove newline character
      print "Enter number to factorialze (must not be negative or decimal) (or 'q' to quit or 'r' to restart): "
      input3 = gets.chomp
      
      # Check for quit
      break if input3.downcase == 'q'

      # Check for restart
      if input3.downcase == 'r'
        print "Restarting Calculator...\n"
        next
      end 
      
      # Set num1 for calculate function
      num1 = input3.to_i

      # Call the calculate function with user input
      result = calculate(num1, num2, operator)

      # Display the result
      puts "Result: #{result}"

      # Print a newline for better readability and informs user that calculator is resetting
      puts "\n"
      print "Restating Calculator...\n"
    end

    # Prompt user for the first number or to quit
    print "Enter first number (or 'q' to quit or 'r' to restart): "

    # Get user input for first number and remove newline character
    input1 = gets.chomp

    # Check for quit
    break if input1.downcase == 'q'

    # Check for restart
    if input1.downcase == 'r'
      print "Restarting Calculator...\n"
      next
    end 
  
    # Convert input to float
    num1 = input1.to_f

    # Prompt user for the second number
    print "Enter second number (or 'q' to quit or 'r' to restart): "

    # Get user input for second number and remove newline character
    input2 = gets.chomp

    # Check for quit
    break if input2.downcase == 'q'

    # Check for restart
    if input2.downcase == 'r'
      print "Restarting Calculator...\n"
      next
    end

    # Convert input to float
    num2 = input2.to_f
  
    # Call the calculate function with user inputs
    result = calculate(num1, num2, operator)

    # Display the result
    puts "Result: #{result}"

    # Print a newline for better readability and informs user that calculator is resetting
    puts "\n"
    print "Restating Calculator...\n"
  end
  
  # Display exit message when the loop is broken
  puts "Thank you for using the calculator!"
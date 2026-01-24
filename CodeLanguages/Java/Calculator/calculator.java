package Java.Calculator;

// import functions
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(System.lineSeparator());
        int option;
        // Prompt the user for calculation option
        System.out.println("Choose from the following operations (Enter number of selection):");
        System.out.println("0. Quit Program \n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \n5. Modulus \n6. Exponential \n7. Root Function");
        System.out.print("Option: ");

        // Set input to calculator option
        option = scanner.nextInt();

        // Create switch to handle user input to start calculation
        switch (option) {
            case 1:
                // Code for handling addition option

                // Open scanner for addition
                Scanner AddScanner = new Scanner(System.in);

                // Collect users first number
                System.out.print("Enter your first number: ");
                double addNum1 = AddScanner.nextDouble();
                
                // Collect users second number
                System.out.print("Enter your second number: ");
                double addNum2 = AddScanner.nextDouble();

                // Pass users numbers to addition class for calculation and print
                System.out.print("Addition of " + addNum1 + " and " + addNum2 + " is equal to: ");
                System.out.print(addition(addNum1,addNum2));
                System.out.println();

                // Close AddScanner to free up system resources
                AddScanner.close();
                break;

            case 2:
                // Code for handling subtraction option

                // Open scanner for subtraction
                Scanner subScanner = new Scanner(System.in);

                // Collect users first number
                System.out.print("Enter your first number: ");
                double subNum1 = subScanner.nextDouble();

                // Collect users second number
                System.out.print("Enter your second number: ");
                double subNum2 = subScanner.nextDouble();
                
                // Pass users numbers to subtraction class for calculation and print
                System.out.print("Subtraction of " + subNum1 + " and " + subNum2 + " is equal to: ");
                System.out.print(subtraction(subNum1,subNum2));
                System.out.println();

                // Close SubScanner to free up system resources
                subScanner.close();
                break;

            case 3:
                // Code for handling subtraction option

                // Open scanner for subtraction
                Scanner multiScanner = new Scanner(System.in);

                // Collect users first number
                System.out.print("Enter your first number: ");
                double mulNum1 = multiScanner.nextDouble();

                // Collect users second number
                System.out.print("Enter your second number: ");
                double mulNum2 = multiScanner.nextDouble();
                
                // Pass users numbers to subtraction class for calculation and print
                System.out.print("Multiplication of " + mulNum1 + " and " + mulNum2 + " is equal to: ");
                System.out.print(multiplication(mulNum1,mulNum2));
                System.out.println();

                // Close SubScanner to free up system resources
                multiScanner.close();
                break;

            case 4:
                // Code for handling Division option
                
                // Open scanner for division
                Scanner divScanner = new Scanner(System.in);

                // Collect users first number
                System.out.print("Enter your first number: ");
                double divNum1 = divScanner.nextDouble();

                // Collect users second number
                System.out.print("Enter your second number: ");
                double divNum2 = divScanner.nextDouble();

                // Check for Divide by 0
                if (divNum2 != 0) {
                    // Pass numbers to division class for calculation and print
                    System.out.print("Division of " + divNum1 + " by " + divNum2 + " is equal to: ");
                    System.out.println(division(divNum1,divNum2));
                    System.out.println();

                }
                else {
                    // Inform user that dividing by zero is not defined. 
                    System.out.println("Can not Divide by 0!");
                    System.out.println("Restarting Program...");
                    main(args);
                    System.out.println();
                    
                    // Close scanner before program exit 
                    divScanner.close();
                    break;
                }

                // Close divScanner to free up system resources
                divScanner.close();
                break;
                
            case 5:
                // Code for handling Modulus option
                
                // Open scanner for modulus 
                Scanner modScanner = new Scanner(System.in);

                // Collect users first number
                System.out.print("Enter your first number: ");
                int modNum1 = modScanner.nextInt();

                // Collect users second number
                System.out.print("Enter your second number: ");
                int modNum2 = modScanner.nextInt();

                // Pass numbers to modulus class for calculation and print
                System.out.print("Modulus of " + modNum1 + " by " + modNum2 + " has remainder of: ");
                System.out.println(modulus(modNum1,modNum2));
                System.out.println();

                // Close modScanner to free up system resources
                modScanner.close();
                break;

            case 6:
                // Code for handling Exponential option
                
                // Open scanner for Exponential
                Scanner expScanner = new Scanner(System.in);

                // Collect users first number
                System.out.print("Enter your first number: ");
                double expNum1 = expScanner.nextDouble();

                // Collect users second number
                System.out.print("Enter you second number: ");
                double expNum2 = expScanner.nextDouble();

                // Pass numbers to exponential class for calculation and print
                System.out.print("Exponential of " + expNum1 + " raised to the " + expNum2 + " power is: ");
                System.out.println(exponential(expNum1,expNum2));

                //close expScanner to free up system resources
                expScanner.close();
                break;

            case 7:
                // Code for handling Square Root option
                
                // Open scanner for square root
                Scanner rootScanner = new Scanner(System.in);
                
                // Collect users first number
                System.out.print("Enter your first number: ");
                double rootNum1 = rootScanner.nextDouble();

                // Collect users second number
                System.out.print("Enter you second number: ");
                int rootNum2 = rootScanner.nextInt();

                // Pass numbers to exponential class for calculation and print

                // Check for the root by 0
                if (rootNum2 != 0) {
                    System.out.print("The root of " + rootNum1 + " rooted by " + rootNum2 + " is: ");
                    System.out.println(root(rootNum1,rootNum2));
                } else {
                    System.out.println("Can not root by 0!");
                    System.out.println("Restarting Program...");
                    main(args);
                }

                //close expScanner to free up system resources
                rootScanner.close();
                break;

            case 0:
                // Code to exit program.
                System.out.println("Ending Program...");
                
                // Pass exit code to JVM to terminate program
                System.exit(0);
                break;

            default:
                // Default handler to restart program on invalid entry
                System.out.println("Invalid option.");
                System.out.println("Restarting Program...");
                main(args);
                break;
        }
        scanner.close();
    }

    // Private addition class for handling addition option
    private static double addition(double addNum1, double addNum2) {
        // Return calculated number to method call
        return addNum1 + addNum2;
    }

    // Private subtraction class for handling subtraction option
    private static double subtraction(double subNum1, double subNum2) {
        // Return calculated number to method call
        return subNum1 - subNum2;
    }

    // Private multiplication class for handling multiplication option
    private static double multiplication(double mulNum1, double mulNum2) {
        // Return calculated number to method call
        return mulNum1 * mulNum2;
    }

    // Private division class for handling division option
    private static double division(double divNum1, double divNum2) {
        // Return calculated number to method call
        return divNum1 / divNum2;
    }

    // Private modulus class for handling modulus option
    private static int modulus(int modNum1, int modNum2) {
        // Return calculated number to method call
        return modNum1 % modNum2;
    }
    
    // Private exponential class for handling exponential option
    private static double exponential(double expNum1, double expNum2) {
        // Return calculated number to method call
        return Math.pow(expNum1,expNum2);
    }

    // Private root class for handling root option
    private static double root(double rootNum1, double rootNum2) {
        // Return calculated number to method call
        return Math.pow(rootNum1, (1/rootNum2));
    }
}
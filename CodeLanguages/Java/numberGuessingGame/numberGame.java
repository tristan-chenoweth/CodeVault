package Java.numberGuessingGame;

// Import java functions
import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {
        // Scanner object
        Scanner option = new Scanner(System.in);

        // Print out Program starting message and prompt for user selection
        System.out.println("Welcome to the Guessing Game!");
        System.out.println("You get 3 chances to guess a number from 1 to 100 and see if you're right");
        System.out.println();
        System.out.println("Would you like to play?");
        System.out.println("1. Yes with hints \n2. Yes with no hints \n3. No");
        System.out.println();

        // Gater option from choice from the user.
        int reply = option.nextInt();

        // Handles option 1
        while (reply == 1) {
            // Handles option to play with hints

            // Generate a random number
            int numRandom = numRandom();
            
            // For troubleshooting uncomment the line below to print the number that was randomly generated
            // System.out.println(numRandom);  

            System.out.print("Please enter a number 1 to 100: ");

            // Gather guess one from user and store in variable for checking
            int numGuess1 = option.nextInt();

            // If statement for checking if number guessed is correct
            if (numGuess1 == numRandom) {
                System.out.println();
                System.out.println("You guessed it right!");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Sorry, that is not correct...");

                // If Else statement for providing hint
                if (numGuess1 < numRandom) {
                    System.out.println();
                    System.out.println("Number is higher.");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Number is lower.");
                    System.out.println();
                }
            }

            System.out.println();
            System.out.print("Please enter your second guess: ");

            // Gather guess two from user and store in variable for checking
            int numGuess2 = option.nextInt();

            // If Else statement for checking if number guessed is correct
            if (numGuess2 == numRandom) {
                System.out.println();
                System.out.println("You guessed it right!");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Sorry, that is not correct...");

                // If Else statement for providing hint
                if (numGuess2 < numRandom) {
                    System.out.println();
                    System.out.println("Number is higher.");
                    System.out.println();
                } else {
                    System.out.println();
                    System.out.println("Number is lower.");
                    System.out.println();
                }
            }

            System.out.println();
            System.out.print("Please enter your final guess: ");

            // Gather guess three from user and store in variable for checking
            int numGuess3 = option.nextInt();

            // If Else statement for checking if number guessed is correct
            if (numGuess3 == numRandom) {
                System.out.println();
                System.out.println("You guessed it right!");
                System.out.println();
            } else { // This else checks final input and when incorrect prints the random number that was generated for this game
                System.out.println();
                System.out.println("Sorry, that is not correct...");
                System.out.println("The correct number is " + numRandom + ".");
                System.out.println();
            }

            System.out.println("Would you like to play again?");
            System.out.println("1. Yes with hints \n2. Yes with no hints \n3. No");

            // Gather option from user if they want to continue and store in variable
            reply = option.nextInt();

            // If statement to handle option 3 if given
            if (reply == 3) {
                System.out.println("Thanks for playing!");

                // close option scanner
                option.close();

                // Send exit code of 0 and exit JVM
                System.exit(0);
            }
        }

        // Handles option 2
        while (reply == 2) {
            // Handles option to play without hints

            // Generate a random number
            int numRandom = numRandom();

            // For troubleshooting uncomment the line below to print the number that was randomly generated
            // System.out.println(numRandom);

            System.out.print("Please enter a number 1 to 100: ");

            // Gather guess one from user and store in variable for checking
            int numGuess1 = option.nextInt();

            // If statement for checking if number guessed is correct
            if (numGuess1 == numRandom) {
                System.out.println();
                System.out.println("You guessed it right!");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Sorry, that is not correct...");
            }

            System.out.println();
            System.out.print("Please enter your second guess: ");

            // Gather guess two from user and store in variable for checking
            int numGuess2 = option.nextInt();

            // If statement for checking if number guessed is correct
            if (numGuess2 == numRandom) {
                System.out.println();
                System.out.println("You guessed it right!");
                System.out.println();
            } else {
                System.out.println();
                System.out.println("Sorry, that is not correct...");
            }

            System.out.println();
            System.out.print("Please enter your final guess: ");

            // Gather guess three from user and store in variable for checking
            int numGuess3 = option.nextInt();

            // If statement for checking if number guessed is correct
            if (numGuess3 == numRandom) {
                System.out.println();
                System.out.println("You guessed it right!");
                System.out.println();
            } else { // This else checks final input and when incorrect prints the random number that was generated for this game
                System.out.println();
                System.out.println("Sorry, that is not correct...");
                System.out.println("The correct number is " + numRandom + ".");
                System.out.println();
            }

            System.out.println("Would you like to play again?");
            System.out.println("1. Yes with hints \n2. Yes with no hints \n3. No");

            // Gather option from user if they want to continue and store in variable
            reply = option.nextInt();

            // If statement to handle option 3 if given
            if (reply == 3) {
                System.out.println("Thanks for playing!");

                // close option scanner
                option.close();

                // Send exit code of 0 and exit JVM
                System.exit(0);
            }
        }

        // Handles option 3
        while (reply == 3) {
            System.out.println("Thanks for playing!");

            // close option scanner
            option.close();

            // Send exit code of 0 and exit JVM
            System.exit(0);
        }
    }

    // Private class for creation of random number between 1 and 100
    private static int numRandom() {
        Random generator = new Random();
        return generator.nextInt(100) + 1;
    }
}

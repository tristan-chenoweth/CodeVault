import java.util.Scanner; //allows for the use of thescanner

public class computeBudget {
	public static void main(String[] args){
		double budget; //variable for budget
		double grocery; //variable for grocery
		double health_and_fitness; //variable for health_and_fitness
		double fun_and_adventure; //variable for fun_and_adventure
		double future_savings; //variable for future_savings

		Scanner input=new Scanner(System.in); //scanner

		System.out.println("Enter allotted amount for budgeting: "); // gather input for allotted budget
		budget=input.nextDouble();

		grocery = budget*.3;
		health_and_fitness = budget*.2;
		fun_and_adventure = budget*.2;
		future_savings = budget*.3;

		System.out.println("The amount put towards Groceries will be: " + grocery);
		System.out.println("The amount put towards Health and Fitness will be: " + health_and_fitness);
		System.out.println("The amount put towards Fun and Adventure will be: " + fun_and_adventure);
		System.out.println("The amount put towards Future Savings will be: " + future_savings);

		/*
		I started off by importing the scanner for future use in my code. I then stated the basic code including the
		class information. I then defined my variables to use. I then required input from the user on the alloted
		salary. I then set up equations to take the percentage in decimal form that Alice wanted to put towards that
		specific area. I then had the computer print out each individual budget number on its own line of code.
		*/

		}
}
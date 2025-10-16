 import java.util.Scanner;

	public class ProfWright{
		public static void main(String [] args){
			double grade1;
			double grade2;
			double grade3;
			double grade4;
			double grade5;
			double average;

			Scanner input= new Scanner(System.in);

			System.out.println("Enter score for 1st class:");
			grade1 = input.nextDouble();

			System.out.println("");

			System.out.println("Enter score for 2nd class:");
			grade2 = input.nextDouble();

			System.out.println("");

			System.out.println("Enter score for 3rd class:");
			grade3 = input.nextDouble();

			System.out.println("");

			System.out.println("Enter score for 4th class:");
			grade4 = input.nextDouble();

			System.out.println("");

			System.out.println("Enter score for 5th class:");
			grade5 = input.nextDouble();

			System.out.println("");

			average = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;

			System.out.println("Your average grade is " + average + " .");

			System.out.println("");

			if (average >= 69){
				if (average >= 79){

					if (average >= 80){
						System.out.println("The final grade is a A.");
						}
					else{
						System.out.println("The final Grade is a B.");
						}
					}
				else{
					if (average >= 70){
						System.out.println("The final grade is a B.");
						}
					else{
						System.out.println("The final grade is a C.");
						}
					}
				}
			else{
				if (average >= 60){
					System.out.println("The final grade is a C.");
					}
				else{
					System.out.println("The final grade is an F.");
					}
				}
			System.out.println("");
	}
}
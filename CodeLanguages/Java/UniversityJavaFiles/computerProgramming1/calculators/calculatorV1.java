import java.util.Scanner;

	public class calculatorV1{
		public static void main(String [] args){
			int math;
			double number_1;
			double number_2;
			double answer;

			Scanner input= new Scanner(System.in);

			System.out.println("What is your first number: ");
			number_1 = input.nextDouble();

			System.out.println("");

			System.out.println("What is your second number: ");
			number_2 = input.nextDouble();

			System.out.println("");


			System.out.println("1 - Addition");
			System.out.println("2 - Subtraction");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Division");
			System.out.println("");
			System.out.println("What would you like to do with your two numbers?");
			math = input.nextInt();

			if (math == 1){
				answer = number_1 + number_2;

				System.out.println("When added together your numbers " + number_1 + " and " + number_2 + " is " + answer);
			}

			else if(math == 2){
				answer = number_1 - number_2;

				System.out.println("When subracted your numbers " + number_1 + " and " + number_2 + " is " + answer);
			}

			else if(math == 3){
				answer = number_1 * number_2;

				System.out.println("When multiplied together your numbers " + number_1 + " and " + number_2 + " is " + answer);
			}

			else if(math == 4){
				answer = number_1 / number_2;

				System.out.println("When divided your numbers " + number_1 + " and " + number_2 + " is " + answer);
			}

			System.out.println("");

	}
}
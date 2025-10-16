 import java.util.Scanner;

	public class calculatorV2{
		public static void main(String [] args){
			int math;
			int i;
			double number_1;
			double number_2;
			double answer;

			i = 1;

			while (i == 1){

				Scanner input= new Scanner(System.in);

				System.out.println("1 - Addition");
				System.out.println("2 - Subtraction");
				System.out.println("3 - Multiplication");
				System.out.println("4 - Division");
				System.out.println("5 - Exit Program");
				System.out.println("");
				System.out.println("What would you like to do with your two numbers?");
				math = input.nextInt();

				if (math == 5){
					System.out.println("");

					System.out.println("End of program.");

					i--;
				}

				else {

					System.out.println("");

					System.out.println("What is your first number: ");
					number_1 = input.nextDouble();

					System.out.println("");

					System.out.println("What is your second number: ");
					number_2 = input.nextDouble();

					System.out.println("");


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
				}



				System.out.println("");
				System.out.println("");

			}
	}
}
import java.util.Scanner;

	public class prime{
		public static void main(String [] args){

		double i;
		double number;

		i = 2;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter your number:");
		number = input.nextDouble();

			while(i < number) {
				if (i % 2 == 0){
					System.out.println("This is not a prime number.");
					i--;
				}
				else if (i % 3 == 0){
					System.out.println("This is not a prime number.");
					i--;
				}
				else if (i % 4 == 0) {
					System.out.println("This is not a prime number.");
					i--;
				}
				else if (i % 5 == 0) {
					System.out.println("This is not a prime number.");
					i--;
				}
				else {
					System.out.println("This is a prime number.");
					i--;
				}
			}
		}
	}
}



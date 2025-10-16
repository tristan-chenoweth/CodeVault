import java.util.Scanner;

	public class prime_2{
		public static void main(String [] args){

		int i;
		int number;
		int status;
		int j;

		j = 2;


		/*Scanner input = new Scanner(System.in);

		System.out.println("Enter your number:");
		n = input.nextInt();

		*/

		while(j < 200000) {
			i = 2;
			status = 0;

			while (i < j){
				if (j % i == 0){
					status = 1;
					break;
				}

			i++;

			}

			if (status == 0){
				System.out.println(j + " is a prime number.");
			}

		j++;

		}
	}
}



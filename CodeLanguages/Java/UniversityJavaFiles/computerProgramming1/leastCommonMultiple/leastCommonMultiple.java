import java.util.Scanner;

public class leastCommonMultiple {
	public static void main (String [] args){
		int num_1;
		int num_2;

		Scanner input = new Scanner (System.in);

		System.out.println("What is your first number?");
		num_1 = input.nextInt ();

		System.out.println("");

		System.out.println("What is your second number?");
		num_2 = input.nextInt();

		System.out.println ("");


		LCM (num_1, num_2);

	}

	public static void LCM (int num_1, int num_2){

		int i;
		int max;
		int min;
		int x;
		int lcm = 1;



		if (num_1 > num_2){
			max = num_1;
			min = num_2;
		}

		else{
			max = num_2;
			min = num_1;
		}

		for (i = 1; i < min; i++){
			x = max * i;

			if (x % min == 0){
				lcm = x;
				break;
			}
		}

		System.out.println("The LCM of " + num_1 + " and " + num_2 + " is " + lcm);
	}
}
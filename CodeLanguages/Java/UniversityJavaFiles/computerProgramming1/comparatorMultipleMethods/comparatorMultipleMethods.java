import java.util.Scanner;

public class comparatorMultipleMethods {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int vote = count(20,10);
		System.out.println("The max is " + vote);

		double greater_1 = count(20.0, 10.0);
		System.out.println("The greater number is " + greater_1);

		int greater_2 = count(20, 10, 5);
		System.out.println("The greater number is " + greater_2);

		double greater_3 = count(20.0, 10.0, 5.0);
		System.out.println("The greater number is " + greater_3);

	}


	public static int count (int count_1, int count_2){

		if (count_1 < count_2){
			return count_2;
		}
		
		else {
			return count_1;
		}
	}

	public static double count(double num_1, double num_2){
	if (num_1 > num_2){
		return num_1;
		}
		else {
			return num_2;
		}

	}

	public static int count (int val_1, int val_2, int val_3){
		if (val_1 > val_2 && val_1 > val_3){
			return val_1;
		}

		else if (val_2 > val_1 && val_2 > val_3){
			return val_2;
		}

		else{
			return val_3;
		}

	}

	public static double count (double val_a, double val_b, double val_c){

		if (val_a > val_b && val_a > val_c){
			return val_a;
		}

		else if (val_b > val_a && val_b > val_c){
			return val_b;
		}

		else{
			return val_c;
		}

	}

}

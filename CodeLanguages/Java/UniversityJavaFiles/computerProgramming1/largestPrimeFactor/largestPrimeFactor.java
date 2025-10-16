import java.util.Scanner;

public class largestPrimeFactor {

	public static void main(String[] args) {

		int total;
		int factor;
		int inputValue;

		Scanner input = new Scanner(System.in);

		System.out.print("Choose a number: ");

		total = input.nextInt();

		inputValue = total;

			for(factor = 2; factor <= inputValue; factor++){

				if(inputValue % factor == 0){

				inputValue/=factor;

				factor--;

				}

			}

		System.out.println("The largest prime factor is " + factor);

	}
}
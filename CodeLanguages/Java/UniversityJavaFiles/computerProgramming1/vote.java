import java.util.Scanner;

public class vote {
	public static void main (String [] args){

		/*

		int choice;
		int i = 1;

		int region_number;
		int number_of_voters;

		Scanner input= new Scanner(System.in);

		while (i == 1){
			System.out.println("1 - run program");
			System.out.println("2 - exit program");
			System.out.println("");
			choice = input.nextInt();

			System.out.println("");

			if (choice == 1){
				System.out.println("How many regions: ");
				region_number = input.nextInt();
															// for user input of both numbers
				System.out.println("");

				System.out.println("How many voters: ");
				number_of_voters = input.nextInt();

				System.out.println("");

				result(region_number, number_of_voters);

				System.out.println("");
			}

			else {
				break;
			}

		}
		*/




		int choice;
		int i = 1;

		Scanner input= new Scanner(System.in);

		while (i == 1){
			System.out.println("1 - run program");
			System.out.println("2 - exit program");
			System.out.println("");

			choice = input.nextInt();

			System.out.println("");

			if (choice == 1){

				result(53, 149);

				System.out.println("");

			}

			else {
				break;

			}

		}



	} // end bracket of first method

	// New Method

	public static void result (int region, int voter){

				int i;
				int j;
				int number;
				int candidate_1 = 0;
				int candidate_2 = 0;
				int counter_1 = 0;
				int counter_2 = 0;


				for (i = 1; i<= region; i++){
					for (j = 1; j<= voter; j++){
						number = (int)(Math.random() * 10);
						if(number % 2 == 0){
							candidate_1++;
						}

						else {
							candidate_2++;
						}
					}

					if (candidate_1 > candidate_2){
						counter_1++;
					}

					else {
						counter_2++;
					}

					candidate_1 = 0;
					candidate_2 = 0;

				}


				if (counter_1 > counter_2){
					System.out.println("Candidate 1 wins with " + counter_1 + " states and Candidate 2 lost with a total of " + counter_2 + " states");
				}

				else {
					System.out.println("Candidate 2 wins with " + counter_2 + " states and Candidate 1 lost with a total of " + counter_1 + " states");
				}

	} // end of second method
}
import java.util.Scanner;

// Tax calculations based off of old tax bracket data

	public class Taxes{
		public static void main(String [] args){

			int status;
			double income;
			double tax;

			Scanner input= new Scanner(System.in);

			System.out.println("1 - Single");
			System.out.println("2 - Married, Joint");
			System.out.println("3 - Head of Household");

			System.out.println("");  //adds space between list of opions for status and the question for the status itself

			System.out.println("What is your marriage status: ");
			status = input.nextInt();

			System.out.println(""); // adds space between answer of status and the input quesion for income

			System.out.println("What is your yearly income/salary: ");
			income = input.nextDouble();

			System.out.println(""); // adds space between income input and the output of the calculation itself

			if (status == 1){
				if (income < 9275){
					tax = .10 * income;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 9275 && income < 37650){
					tax = .10 * 9275 + (income - 9275) * .15;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 37650 && income < 91150){
					tax = .10 * 9275 + (37650 - 9275) * .15 + (income - 37650) * .25;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 91150 && income < 190150){
					tax = .10 * 9275 + (37650 - 9275) * .15 + (income - 37650) * .25 + (income - 91150) * .28;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 190150 && income < 413350){
					tax = .10 * 9275 + (37650 - 9275) * .15 + (income - 37650) * .25 + (income - 91150) * .28 + (income - 190150) * .33;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 413350 && income < 415050){
					tax = .10 * 9275 + (37650 - 9275) * .15 + (income - 37650) * .25 + (income - 91150) * .28 + (income - 190150) * .33 + (income - 413350) * .35;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income > 415050){
					tax = .10 * 9275 + (37650 - 9275) * .15 + (income - 37650) * .25 + (income - 91150) * .28 + (income - 190150) * .33 + (income - 413350) * .35 + (income - 415050) * .396;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

			}

			else if (status == 2){
				if (income < 18550){
					tax = .10 * income;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 18550 && income < 75300){
					tax = .10 * 18550 + (income - 18550) * .15;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 75300 && income < 151900){
					tax = .10 * 18550 + (75300 - 18550) * .15 + (income - 75300) * .25;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 151900 && income < 231450){
					tax = .10 * 18550 + (75300 - 18550) * .15 + (income - 75300) * .25 + (income - 151900) * .28;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 231450 && income < 413350){
					tax = .10 * 18550 + (75300 - 18550) * .15 + (income - 75300) * .25 + (income - 151900) * .28 + (income - 231450) * .33;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 413350 && income < 466950){
					tax = .10 * 18550 + (75300 - 18550) * .15 + (income - 75300) * .25 + (income - 151900) * .28 + (income - 231450) * .33 + (income - 413350) * .35;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income > 466950){
					tax = .10 * 18550 + (75300 - 18550) * .15 + (income - 75300) * .25 + (income - 151900) * .28 + (income - 231450) * .33 + (income - 413350) * .35 + (income - 466950) * .396;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}
			}

			else if (status == 3){
				if (income < 13250){
					tax = .10 * income;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 13250 && income < 50400){
					tax = .10 * 13250 + (income - 13250) * .15;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 50400 && income < 130150){
					tax = .10 * 13250 + (50400 - 13250) * .15 + (income - 50400) * .25;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 130150 && income < 210800){
					tax = .10 * 13250 + (50400 - 13250) * .15 + (income - 50400) * .25 + (income - 130150) * .28;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 210800 && income < 413350){
					tax = .10 * 13250 + (50400 - 13250) * .15 + (income - 50400) * .25 + (income - 130150) * .28 + (income - 210800) * .33;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income >= 413350 && income < 441000){
					tax = .10 * 13250 + (50400 - 13250) * .15 + (income - 50400) * .25 + (income - 130150) * .28 + (income - 210800) * .33 + (income - 413350) * .35;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}

				else if (income > 441000){
					tax = .10 * 13250 + (50400 - 13250) * .15 + (income - 50400) * .25 + (income - 130150) * .28 + (income - 210800) * .33 + (income - 413350) * .35 + (income - 441000) * .396;

					System.out.println("Your tax for this year is: $" + tax + ".");
				}
			}
			System.out.println("");

	}
}
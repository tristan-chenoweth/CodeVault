import java.util.Scanner;
	public class enterGrade {
		public static void main (String []args){

			System.out.println ("Enter your score: ");

			Scanner input = new Scanner (System.in);

			double marks = input.nextDouble();

			if (marks>=90){
				System.out.println("A");
			}
			else if (marks>=80){
				System.out.println("B");
			}
			else if (marks>=70){
				System.out.println("C");
			}
			else if (marks>=60){
				System.out.println("D");
			}
			else {
				System.out.println("F");
			}


			if (marks>=80){
				System.out.println("Congrats");
			}
			else if (marks>=70 && marks<=80){
				System.out.println("No too bad!");
			}
			else {
				System.out.println("You can do better than that!");
			}

		}
	}

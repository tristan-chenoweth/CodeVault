import java.util.*;
import java.io.*;

public class payroll
{
	public static void main(String [] args) throws Exception
	{
		File file = new File("employees.txt");
		Scanner reader = new Scanner(file);

		String first_name;
		String last_name;
		double salary;
		int lineNum = 0;

		double total_salary = 0;
		double avg_salary;


		while (reader.hasNext())
		{
			String [] split = reader.nextLine().split(" ");
			first_name = split[0];
			last_name = split[1];
			double d =  Double.parseDouble(split[2]);
			salary = d;

			total_salary += salary;
			System.out.print(first_name + " " + last_name + " " + salary + "\n");
			lineNum ++;
		}

		avg_salary = total_salary/lineNum;

		System.out.println("\n" + "Average: " + avg_salary);

		reader.close();
	}
}
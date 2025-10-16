import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.io.*;

public class number_maker
{
	public static void main (String [] args) throws Exception
	{
		// Attributes

		String file_name;
		int start_num;
		int stop_num;
		int step_num;

		int num_per_line_count = 0;

		// Scanner and getting inputs

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a start number: ");
		start_num = input.nextInt();

		System.out.print("Enter a stop number: ");
		stop_num = input.nextInt();

		System.out.print("Enter a step number: ");
		step_num = input.nextInt();

		System.out.print("Enter a file name: ");
		file_name = input.next();

		// Setting up File and PrintWriter

		File file = new File(file_name);
		PrintWriter writer = new PrintWriter(file);

		// For loop for printing numbers

		for (int i = start_num; i < stop_num; i += step_num)
		{
			if (num_per_line_count == 10)
			{
				writer.println();
				num_per_line_count = 0;
			}

			writer.print(i + " ");


			num_per_line_count ++;
		}

		writer.close();

		System.out.println();
		System.out.println("Writing Done!");
	}
}
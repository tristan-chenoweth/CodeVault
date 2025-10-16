import java.util.*;
import java.lang.*;
import java.math.*;
import java.text.*;
import java.io.*;

public class prime_digits
{
	public static void main(String [] args) throws Exception
	{
		// variables to hold count of numbers and file name

		String file_name;

		long zero = 0;
		long one = 0;
		long two = 0;
		long three = 0;
		long four = 0;
		long five = 0;
		long six = 0;
		long seven = 0;
		long eight = 0;
		long nine = 0;
		long total = 0;

		// setting up scanner to get user input

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		file_name = input.next();

		input.close();

		// setting up file reader

		File file = new File(file_name);
		Scanner reader = new Scanner(file);

		// while loop to reader all of file

		while(reader.hasNext())
		{
			String [] split_line = reader.next().split("");

			for(int i = 0; i < split_line.length; i++)
			{
				if (Integer.parseInt(split_line[i]) == 0)
				{
					zero++;
					total++;
					continue;
				}

				else if (Integer.parseInt(split_line[i]) == 1)
				{
					one++;
					total++;
					continue;
				}

				else if (Integer.parseInt(split_line[i]) == 2)
				{
					two++;
					total++;
					continue;
				}

				else if (Integer.parseInt(split_line[i]) == 3)
				{
					three++;
					total++;
					continue;
				}

				else if (Integer.parseInt(split_line[i]) == 4)
				{
					four++;
					total++;
					continue;
				}

				else if (Integer.parseInt(split_line[i]) == 5)
				{
					five++;
					total++;
					continue;
				}

				else if (Integer.parseInt(split_line[i]) == 6)
				{
					six++;
					total++;
					continue;
				}

				else if (Integer.parseInt(split_line[i]) == 7)
				{
					seven++;
					total++;
					continue;
				}

				else if (Integer.parseInt(split_line[i]) == 8)
				{
					eight ++;
					total++;
					continue;
				}

				else if (Integer.parseInt(split_line[i]) == 9)
				{
					nine++;
					total++;
					continue;
				}
			}

		}
		reader.close();

		System.out.println("0s: " + zero);
		System.out.println("1s: " + one);
		System.out.println("2s: " + two);
		System.out.println("3s: " + three);
		System.out.println("4s: " + four);
		System.out.println("5s: " + five);
		System.out.println("6s: " + six);
		System.out.println("7s: " + seven);
		System.out.println("8s: " + eight);
		System.out.println("9s: " + nine);

		System.out.println();

		System.out.println("Total: " + total);
	}
}
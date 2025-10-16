import java.util.*;
import java.io.*;

public class counting
{
	public static void main (String [] args) throws Exception
	{
		// Setting up varibles to use in program

		String file_name;
		int char_count = 0;
		int word_count = 0;
		int line_count = 0;

		// setting up scanner and reader for user input file

		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		file_name = input.next();

		input.close();

		File file = new File(file_name);
		Scanner reader = new Scanner(file);
		Scanner reader_2 = new Scanner(file);

		// While loops for reading file


		while (reader_2.hasNextLine())
		{
			// Line counter

		    line_count++;
		    reader_2.nextLine();
		}

		while(reader.hasNext())
		{
			// Word counter

			String line = reader.next();
			String [] line_split = line.split(" ");

			word_count += line_split.length;

			// Character counter

			for(int i = 0; i < line_split.length; i++)
			{
				char_count += line_split[i].length();
			}
		}

		reader.close();
		reader_2.close();

		System.out.println("Characters: " + char_count);
		System.out.println("Words: " + word_count);
		System.out.println("Lines: " + line_count);
	}
}
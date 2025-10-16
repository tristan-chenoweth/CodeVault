import java.util.*;
import java.io.*;

public class clean_files
{
	public static void main (String [] args) throws Exception
	{
		// Attributes

		String dirty_file_name;
		String clean_file_name;
		int count = 0;


		// Array of words to clean

		String [] words_in = {"help","dime","ask", "beach", "ship", "fish"};

		// Setting up scanner for user input

		Scanner input = new Scanner(System.in);

		System.out.print("Enter file to clean: ");
		dirty_file_name = input.next();

		System.out.print("Enter file to save to: ");
		clean_file_name = input.next();

		input.close();

		// Setting up file and reader for dirty file and writer for clean file

		File dirty_file = new File(dirty_file_name);
		Scanner reader = new Scanner(dirty_file);

		File clean_file = new File(clean_file_name);
		PrintWriter writer = new PrintWriter(clean_file);

		// While loop to clean and write text


		while(reader.hasNextLine())
		{
			String line = reader.nextLine();
			System.out.println(line);
			String censored_line = line.replaceAll(censor_words(words_in), "*");
			System.out.println(censored_line);
			writer.println(censored_line);
		}

		writer.close();
		reader.close();

	}

	// Method for cleaning text

	public static String censor_words(String[] words) // class to deal with changeing and formatting censored words within the string
		{
			String re = "";

			for (String w : words) // for each word in array of words_in
			{
				for (int i = 0; i < w.length(); i++) // For loop based on lenght of word
				{
					re += String.format("|((?<=%s)%s(?=%s))", w.substring(0, i), w.charAt(i), w.substring(i + 1)); // formats word to specifications and changes characters in those words that neeed to be censored
				}
			}
		    return re.substring(1); // returns original string with words that are censored
	}
}
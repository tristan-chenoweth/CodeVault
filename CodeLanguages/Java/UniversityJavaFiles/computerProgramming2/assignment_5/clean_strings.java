import java.math.*;
import java.lang.*;
import java.util.*;

public class clean_strings
{
	// Main Method

	public static void main(String[] args)
	{

		String user_input;
		String [] words_in = {"help","dime","ask", "beach", "ship", "fish"};

		Scanner input = new Scanner(System.in);

		System.out.print("Enter text to clean: ");
		user_input = input.nextLine();

		System.out.println();
		System.out.println("Cleaned text: " + user_input.replaceAll(censor_words(words_in), "*")); // runs and prints censored word text
	}


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
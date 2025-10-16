import java.util.*;
import java.math.*;
import java.lang.*;


public class word_character_count
{
	public static void main (String [] args)
	{
		String user_input = "";
		String [] array_word;
		String [] array_char;

		int word_count = 0;
		int char_count = 0;

		Scanner input = new Scanner(System.in);

		System.out.print("Enter text to count: ");
		user_input += input.nextLine();

		array_word = user_input.split(" ");

		for (int i = 0; i < array_word.length; i++)
		{
			word_count += 1;
		}

		array_char = user_input.replaceAll(" ", "").split("");

		for (int i = 0; i < array_char.length; i++)
		{
			char_count += 1;
		}

		System.out.println();

		System.out.println("Word Count: " + word_count);
		System.out.println("Character Count: " + char_count);

	}
}
import java.util.*;

public class student
{
	// Main Method

	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		String first_name_input = "";
		String last_name_input = "";
		String grades_ [] = new String [];

		System.out.println("What is your first name: ");
		first_name_input += s.nextLine();

		System.out.println("What is your last name: ");
		last_name_input += s.nextLine();
		student(first_name_input, last_name_input, grades_[])

	}


	// Attributes

	private String first_name;
	private String last_name;
	private int ID;
	private String email;
	private char [] grades = new char [10];

	// Constructors

	student(String first_name_in, String last_name_in, char grades_in[])
	{

	}

	// Operations

	public String to_string()
	{
	}
}
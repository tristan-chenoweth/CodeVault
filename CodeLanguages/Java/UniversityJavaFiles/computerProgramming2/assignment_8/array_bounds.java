import java.util.*;


public class array_bounds
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);

		int arrayIndexNum;

		int array [] = new int [10];

		for (int i = 0; i < array.length; i++)
		{
			array[i] = (int)(Math.random() * 100.0);
		}

		try
		{
			System.out.println("Enter an array index number: ");
			arrayIndexNum = input.nextInt();

			System.out.println("Value at index " + arrayIndexNum + " is: " + array[arrayIndexNum]);
		}

		catch (IndexOutOfBoundsException e_out)
		{
			System.out.println("Index out of bounds.");
		}

		catch (InputMismatchException e_in)
		{
			System.out.println("Incorrect data type.");
		}
	}
}
import java.util.*;

public class keep_real
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");

		double num = input.nextDouble();

		try
		{
			squareRoot(num);

			System.out.println("squareRoot(" + num + ") = " + squareRoot(num));
		}

		catch (IllegalArgumentException ex)
		{
			System.out.println("Invalid input: x is negative: " + ex.getMessage());
		}
	}

	public static double squareRoot (double x) throws IllegalArgumentException
	{
		if (x > 0.0)
		{
			double xRoot = Math.sqrt(x);

			return xRoot;
		}

		else
		{
			throw new IllegalArgumentException(String.valueOf(x));
		}
	}
}
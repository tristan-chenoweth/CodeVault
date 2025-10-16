import java.util.*;
import java.lang.*;
import java.math.*;

public class big_pi
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		BigDecimal iterations;
		int decimal_places;
		BigDecimal PIbig = new BigDecimal("0");
		BigDecimal pi_ = new BigDecimal("0");

		System.out.println("Enter number of iterations: ");
		iterations = input.nextBigDecimal();

		System.out.println("Enter number of decimal places: ");
		decimal_places = input.nextInt();

		BigDecimal calc = BigDecimal.valueOf(0);

		for (int i = 0; i < iterations.intValue(); i++)
		{
			calc = calc.add(PIbig);
		}

		pi_ = calc.divide((BigDecimal)iterations);

		System.out.println("Estimate: " + pi_.setScale(decimal_places)/* .setScale(decimal_places, RoundingMode.HALF_DOWN)*/);
	}
}
import java.math.*;
import java.lang.*;
import java.util.*;

public class mersenne_primes
{
	// Main Method

	public static void main(String [] args)
	{

		BigInteger p;
		int exponent;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter max p: ");
		p = new BigInteger(input.next());

		System.out.println();
		System.out.println("p" + "\t" + "Mersenne Prime");
		System.out.println();

		for(BigInteger i = BigInteger.ZERO; i.compareTo(p) <= 0; i = i.add(BigInteger.ONE))
		{
			if(i.isProbablePrime(100) == true)
			{
				exponent = i.intValue();
				BigInteger pow_base = new BigInteger("2");
				BigInteger info = pow_base.pow(exponent).subtract(BigInteger.ONE);
				System.out.println("Testing: " + exponent);
				if (info.isProbablePrime(100) == true)
				{
					System.out.println(i + "\t" + info);
					System.out.println("");
				}
			}
		}
	}
}
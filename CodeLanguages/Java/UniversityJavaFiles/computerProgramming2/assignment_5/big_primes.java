import java.math.*;
import java.lang.*;
import java.util.*;

public class big_primes
{
	// Main Method

	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.println("Enter start of range: ");
		start_ = new BigInteger(input.next());

		System.out.println("Enter end of range: ");
		end_ = new BigInteger(input.next());

		System.out.println();
		System.out.println("Primes: ");
		System.out.println();

		for(BigInteger i = start_.subtract(BigInteger.ONE); i.compareTo(end_) <= 0; i = i.add(BigInteger.ONE))
		{
			if(i.isProbablePrime(99) == true)
			{
				System.out.println(i);
			}
		}

	}

	// Attributes

		static BigInteger start_;
		static BigInteger end_;
}

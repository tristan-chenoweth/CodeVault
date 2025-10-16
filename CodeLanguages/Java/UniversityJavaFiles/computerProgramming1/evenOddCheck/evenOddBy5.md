```java
import java.util.Scanner;

public class evenOddBy5{
	public static void main(String [] args){
		double num;

		System.out.println("Please enter your number");

		Scanner input = new Scanner (System.in);

		num = input.nextDouble();

		if (num % 2 == 0)
			if (num % 5 == 0)
				System.out.println("Hi 5 Even");

			else
				System.out.println("This number is not divisible by 5 but it is even");

		else
			System.out.println("Odd");


	}
}
```
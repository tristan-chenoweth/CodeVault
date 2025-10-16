```java
import java.util.Scanner;
public class evenOdd{
	public static void main(String[] args) {
		int x;
		System.out.println("Enter your number that is greater than 0 to see if it is even or odd");
		Scanner in = new Scanner (System.in);
		x = in.nextInt();
		if (x % 2 == 0)
			if (x == 0)
				System.out.println("0");
			else
				System.out.println("The number you have entered is an even number");
		else
			System.out.println("The number you have entered is an odd number");

	}
}
```
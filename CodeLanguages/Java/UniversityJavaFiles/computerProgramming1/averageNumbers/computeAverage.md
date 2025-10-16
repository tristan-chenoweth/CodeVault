```java
import java.util.Scanner;

public class computeAverage {
	public static void main(String[] args){
		double variable1;
		double variable2;
		double variable3;
		double average;

		Scanner input=new Scanner(System.in);

		System.out.println("Enter your first value: ");
		variable1=input.nextDouble();

		System.out.println("Enter your second value: ");
		variable2=input.nextDouble();

		System.out.println("Enter your third value: ");
		variable3=input.nextDouble();

		average=(variable1 + variable2 + variable3) / 3;

		System.out.println("The average of the values " + variable1  + ", " + variable2 + ", and " + variable3 + " is " + average);

		}
}
```
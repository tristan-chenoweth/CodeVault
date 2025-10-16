```java
import java.util.Scanner;

public class computeAreaCircleConsole	{
	public static void main(String[] args){
		double radius; //declaring the variable radius
		double area;	//declaring the variable area

		Scanner input=new Scanner(System.in);

		System.out.println("Enter your radius: ");

		radius=input.nextDouble();

		area=radius*radius*3.141592653;

		System.out.println("The area for the circle with a " + radius + " is " + area);

	}
}
```
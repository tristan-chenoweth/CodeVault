```java
import java.util.Scanner; //allows for the use of scanner

public class candyCalculator {
	public static void main(String[] args){
		double volume; //variable for volume
		double radius; //variable for radius
		double height; //variable for height

		Scanner input=new Scanner(System.in); //scanner

		System.out.println("Enter value for radius: "); // gather input for radius
		radius=input.nextDouble();

		System.out.println("Enter value for height: "); // gather input for height
		height=input.nextDouble();

		// constant of pi used is 3.14
		volume = 3.141 * (radius*radius) * (height/3); //equation for solving volume

		System.out.println("The amount of candies that you can fit into a cone with the height of " + height + " and a radius of " + radius + " is: " + volume/4); //shows viewer final output

		}
}
```
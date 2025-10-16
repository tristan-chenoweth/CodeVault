public class computeAreaCylinder{
	public static void main(String[] args){
		double radius; //declaring the variable radius
		double area;	//declaring the variable area
		double height;	//declaring the height variable
		height=25.6;
		radius=10.2;
		area=2*3.1415*radius*height+2*3.1415*(radius*radius);
		System.out.println("The area for the cylinder with the radius " + radius + " and the height " + height + " is " + area + " square units");

	}
}
package homework6;

public class Circle implements Comparable<Circle>{
	private double radius;
	static double PI = 3.1415;
	public Circle(double r) {
		radius = r;
	}
	public double getRadius() {return radius;}
	public double getPerimeter() {
		return 2*PI*radius;
	}
	public double getArea() {
		return PI*radius*radius;
	}
//	public boolean equals(Circle c) {
//		return radius == c.radius;
//	}
	// Generic calls this method instead of equals(Circle c)
	public boolean equals(Object obj) {
		Circle c = (Circle)obj;
		return radius == c.radius;
	}
	// returns negative if this is less than obj
	// returns 0 if this is equal to obj
	// return positive if this is greater than obj
	public int compareTo(Circle c) {
		if (radius > c.radius)
			return 1;
		else if (radius < c.radius)
			return -1;
		else
			return 0;
		// return radius - c.radius
	}
}

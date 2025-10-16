package homework6;

public class ReferenceDemo {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 10;
		Integer i3 = new Integer(10);
		Integer i4 = new Integer(10);
		Integer i5 = 10;
		Integer i6 = i3;
//		System.out.println(i1 == i2);
//		System.out.println(i3 == i4);
//		System.out.println(i3 == i5);
//		System.out.println(i1 == i3);
//		System.out.println(i6 == i3);
		
//		String s1 = new String("Hello");
//		String s2 = "Hello";
//		System.out.println(s1 == s2);
//		System.out.println(s1.equals(s2));

		//		
//		
		Circle c1 = new Circle(200);
		Circle c2 = new Circle(20);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.compareTo(c2));
		
//		System.out.println(c1.getPerimeter());
//		System.out.println(c2.getPerimeter());
//		c1.PI = 10;
//		System.out.println(c1.getPerimeter());
//		System.out.println(c2.getPerimeter());		
	}
}

package homework6;

public class MyArrayDemo {

	public static void main(String[] args) {
		Integer[] numbers1 = new Integer[] {10, 1, -3, 5, 34, 20};
		int[] numbers2 = new int[] {-3, 1, 4, 5, 10, 20};
		String[] names1 = {"Paul", "Andy", "Denise"};
		Circle[] circles1 = {new Circle(10), new Circle(20), new Circle(4)};
//		MyArrayForInt myNumbers = new MyArrayForInt(numbers2);
//		MyArrayForString myStrings = new MyArrayForString(names1);
		
		
		MyArray<Integer> myNumbers = new MyArray<Integer>(numbers1);
		MyArray<String> myNames = new MyArray<String>(names1);
		MyArray<Circle> myCircles = new MyArray<Circle>(circles1);
		
		System.out.println( myNumbers.search(5) );
		System.out.println( myNumbers.findMaxIdx() );
		System.out.println( myNames.search("Denise") );
		System.out.println( myNames.findMaxIdx() );
		System.out.println( myCircles.search(new Circle(20)));
		System.out.println( myCircles.findMaxIdx());

		//		
//		MyArrayForInt myNumbers1 = new MyArrayForInt(numbers1);
////		MyArray myNumbers1 = new MyArray(numbers2);
////		System.out.println(myNumbers1.nums.length);
//		System.out.println( myNumbers1.search(6) );
////		System.out.println( myNumbers1.search(5) );	
////		System.out.println( myNumbers1.search(10) );	
////		System.out.println( myNumbers1.search(20) );	
////		System.out.println( myNumbers1.search(-100) );	
////		System.out.println( myNumbers1.search(2000) );	
//		System.out.println( myNumbers1.findMaxIdx() );
//		
//		myNumbers1.printArray();
//		myNumbers1.remove(6);	
//		myNumbers1.remove(5);	
//		myNumbers1.printArray();
//		myNumbers1.add(15);			
//		myNumbers1.printArray();
//		myNumbers1.add(100);			
//		myNumbers1.printArray();
//		myNumbers1.add(100);			
//		myNumbers1.printArray();
	}

}

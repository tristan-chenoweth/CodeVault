public class array{
	public static void main (String [] args){
		
		double [] myList = new double [10];
		double total = 0;
		
		for (int i = 0; i < myList.length; i++){
			myList[i] = i;
		}
		
		for (int i = 0; i < myList.length; i++){
			System.out.println (myList [i]);
		}
		
		for (int i = 0; i < myList.length; i++){
			total = total + myList[i];
		}
		System.out.println(total);
	}
}
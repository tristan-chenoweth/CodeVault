public class max_example {
	public static void main(String[] args){

		int num_1 = 5;
		int a = 99;


		increment(num_1);
		System.out.println("inside main: " + a);

	}


	public static void increment (int a){
		a++;
		System.out.println("inside method: " + a);
	}



}
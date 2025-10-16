public class forWithModulusOdd{
	public static void main(String[] args) {

		int i;
		int count;

		for(i = 101, count = 0; i < 200; i++){
			if (i % 2 != 0){
				System.out.println(i);
				count++;
			}
			if (count == 10){
				break;
			}
		}
	}
}
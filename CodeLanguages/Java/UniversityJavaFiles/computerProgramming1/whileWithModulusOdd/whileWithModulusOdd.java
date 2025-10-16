public class whileWithModulusOdd{
	public static void main(String[] args) {

		int i;
		i = 101;

		int count;
		count = 0;

		while(i < 200){
			if (i % 2 != 0){
				System.out.println(i);
				count++;
			}
			if (count == 10){
				break;
				}
		i++;
		}
	}
}
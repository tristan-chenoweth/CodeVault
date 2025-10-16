package homework6;

public class MyArray <T> {
	T[] elements;
	int numElements=0;
	
	public MyArray(){
		elements = (T[])new Object[100]; 
	}
	public MyArray(int size){
		elements = (T[])new Object[size];
	}
	public MyArray(T[] numbers){
		elements = (T[])new Object[numbers.length];
		for(int i=0; i<numbers.length;i++)
			elements[i] = numbers[i];
		numElements = elements.length;
	}
	
	public void printArray() {
		System.out.println("printArray("+numElements+","+elements.length+")");
		for(int i=0; i<numElements ; i++)
			System.out.print(elements[i]+" ");
		System.out.println();
	}

	public void remove(T val) {
		int index = linearSearch(val);
		if (index >= 0) { // if val is found
			elements[index] = elements[numElements-1];
			numElements--;
		}
	}
	public boolean isFull() {return numElements == elements.length; }
	private void enlarge() {
		T[] new_elements = (T[]) new Object[elements.length * 2];
		for (int i=0;i<numElements;i++)
			new_elements[i] = elements[i];
		elements = new_elements;
	}
	public void add(T val) {
		if (isFull()) 
			enlarge();
		elements[numElements++] = val;
	}
	
	public int findMaxIdx() {
		int maxIdx = 0;
		for(int i=1; i<numElements; i++)
			if(((Comparable) elements[i]).compareTo(elements[maxIdx]) > 0)	// new challenger is greater
				maxIdx = i;
		return maxIdx;
	}
	private int binarySearch(T val) {
		int start = 0;
		int end = numElements-1;
		int midpoint;
		while(start<=end) {
			midpoint = (start + end)/2;
			if (((Comparable) val).compareTo(elements[midpoint]) > 0)
				start = midpoint + 1;
			else if (((Comparable) val).compareTo(elements[midpoint]) < 0)
				end = midpoint - 1;
			else // val == nums[midpoint]
				return midpoint;
		}
		return -1;
	}
	
	public int search(T val) {
		return linearSearch(val);
	}
	private int linearSearch(T val){
		// returns the index of the given value 'val'.
		// if 'val' is not found, returns -1
		for(int i=0;i<numElements;i++)
			if (elements[i].equals(val))
				return i;
		
		return -1;
	}
//	private void generateNumbers() {
//		// nums[0]=0, nums[1]=2, nums[2]=4,...
//		for(int i=0; i<nums.length; i++)
//			nums[i] = 2*i;
//	}

}

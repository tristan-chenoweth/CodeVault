package apps;

public class ArrayDemo
{
	public static int linearSearch(int nums [], int val)
	{
		for(int i = 0; i < nums.length; i++) // returns the index of the given value 'val'.
		{
			if (nums[i] == val)
			{
				return i;
			}
		}
		return -1; // if 'val' is not found, returns -1
	}
	
	static int binarySearch(int [] nums, int val)
	{
		int start = 0;
		int end = nums.length-1;
		int midpoint;
		
		while(start <= end)
		{
			midpoint = (start + end)/2;
			
			if (val == nums[midpoint])
			{
				return midpoint;
			}
			
			else if (val < nums[midpoint])
			{
				end = midpoint - 1;
			}
			
			else
			{
				start = midpoint + 1;
			}
		}
		return -1;
	}
	
	public static void generateNumbers(int [] nums)
	{
		for(int i = 0; i <nums.length; i++)
		{
			nums[i] = 2*i;
		}
	}
	
	public static void main(String[] args)
	{
		int [] numbers = new int [] {10, 1, -3, 5, 4, 20}; // Can be written like this int numbers1 [] = new int [100] ;
		int [] numbers1 = new int [] {5, 13, 26, 32, 49, 55, 64, 77}; // Manually sorted list
		int [] numbers3 = new int [1000000];
		
		generateNumbers(numbers3);
		
		int randNum = (int)(Math.random()*2000000);
		
		
		
		long startTime = System.nanoTime();
		
		System.out.println(linearSearch(numbers3, randNum));
		
		long endTime = System.nanoTime();
		
		System.out.println("Time taken by linear search is: " + (endTime - startTime));
		
		
		
		startTime = System.nanoTime();
		
		System.out.println(binarySearch(numbers3, randNum));
		
		endTime = System.nanoTime();
		
		System.out.println("Time taken by binary search is: " + (endTime - startTime));
		
//		System.out.println(linearSearch(numbers, 5));
//		System.out.println(linearSearch(numbers, 15));
//		System.out.println(linearSearch(numbers, 10));
//		System.out.println(linearSearch(numbers, 20));
//		
//		System.out.println();
//		
//		System.out.println(binarySearch(numbers1, 26));
//		System.out.println(binarySearch(numbers1, 5));
//		System.out.println(binarySearch(numbers1, 77));
//		System.out.println(binarySearch(numbers1, 45));
//		System.out.println(binarySearch(numbers1, -2));
//		System.out.println(binarySearch(numbers1, 100));
		
		System.out.println("Done");
	}

}

package homework9;

public class MyQueueDemo
{
	public static void main(String[] args) 
	{
		MyQueueLL<Integer> queue1 = new MyQueueLL<Integer>();
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.printQueue();
//		System.out.println(queue1.dequeue());
//		queue1.printQueue();
		queue1.enqueue(30);
		queue1.enqueue(40);
		queue1.enqueue(50);
		queue1.enqueue(60);
		queue1.enqueue(70);
		queue1.printQueue();
//		System.out.println(queue1.dequeue());
//		System.out.println(queue1.dequeue());
//		queue1.printQueue();
		
/*		MyQueue<Integer> queue1 = new MyQueue<Integer>();
		queue1.enqueue(10);
		queue1.enqueue(20);
		queue1.printArray(); queue1.printQueue();
		System.out.println(queue1.dequeue());
		queue1.printArray(); queue1.printQueue();
		queue1.enqueue(30);
		queue1.enqueue(40);
		queue1.enqueue(50);
		queue1.enqueue(60);
		queue1.enqueue(70);
		queue1.printArray(); queue1.printQueue();
		System.out.println(queue1.dequeue());
		System.out.println(queue1.dequeue());
		queue1.printArray(); queue1.printQueue();*/
	}
}
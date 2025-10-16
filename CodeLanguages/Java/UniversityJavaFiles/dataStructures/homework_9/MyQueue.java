package homework9;

public class MyQueue<T> {
	T[] elements;
	int numElements;
	int front;
	int rear;
	public MyQueue() {
		elements = (T[])new Object[5]; 
		front = 0;
		rear = -1;
		numElements = 0;
	}
	public void printArray() {
		System.out.print("printArray(): ");
		for(int i=0; i<elements.length;i++)
			System.out.print(elements[i] + " ");
		System.out.println();
	}
	public void printQueue() {
		System.out.printf("printQueue(%d,%d) %d: ", front, rear, numElements);
		for(int i=front, cnt=0; cnt<numElements ; i=(i+1)%elements.length, cnt++)
			System.out.print(elements[i] + " ");
		System.out.println();
	}
	public void enqueue(T val) {
		if (isFull())
			return;
		rear = (rear + 1) % elements.length;
		elements[rear] = val;
		numElements++;
	}
	public T dequeue() {
		if (isEmpty())
			return null;
		T temp = elements[front];
		front = (front + 1) % elements.length;
		numElements--;
		return temp;
	}
	public boolean isFull() {return numElements == elements.length;}
	public boolean isEmpty() {return numElements == 0;}
}
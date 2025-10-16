package homework9;

public class MyQueueLL<T> {
	SLLNode<T> front;
	SLLNode<T> rear;
	int numElements;
	public MyQueueLL() {
		front = null;
		rear = null;
		numElements = 0;
	}
	public void printQueue() {
		SLLNode<T> curNode = front;
		System.out.printf("printQueue(%d): ", numElements);
		while(curNode != null) {
			System.out.print(curNode.info + " ");
			curNode = curNode.next;
		}
		System.out.println();
	}
	public void enqueue(T val) {
		SLLNode<T> newNode = new SLLNode<T>(val);
		if (front==null) {
			front = newNode;
		}
		else {
			rear.next = newNode;		
		}
		rear = newNode;
		numElements++;
	}
	public T dequeue() {
		
	}
	public boolean isFull() { return false; }
	public boolean isEmpty() { return front == null; }
}
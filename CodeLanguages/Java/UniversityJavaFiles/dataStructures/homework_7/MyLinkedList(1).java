package apps;

public class MyLinkedList {
	SLLNodeForInt head=null;
	int numElements=0;
	
	public MyLinkedList() {	// worst case time complexity: O(1)
		System.out.println("I have been created. Yeah!");
	}
	public MyLinkedList(int[] nums) { // O(nums.length)
		for(int i=nums.length-1;i>=0;i--)
			insertBeginning(nums[i]);
	}
	public void printLinkedList(){	// O(numElements)
		System.out.print("printLinkedList("+numElements+"): ");
		SLLNodeForInt curNode = head;
		while(curNode != null) {
			System.out.print(curNode.info+" ");
			curNode = curNode.next;
		}
		System.out.println();
	}
	
	public void insertBeginning(int val) { // O(1)
		SLLNodeForInt newnode = new SLLNodeForInt(val);
	
		newnode.next = head;
		head = newnode;
		numElements++;
	}
	public void insertEnd(int val) { // O(numElements)
		SLLNodeForInt newnode = new SLLNodeForInt(val);
		if (head == null)
			head = newnode;
		else {
			SLLNodeForInt curNode = head;
			while(curNode.next != null) {
				curNode = curNode.next;
			}
			curNode.next = newnode;
		}
		numElements++;
	}
	public int search(int val) { // O(numElements)
		int i=0;
		SLLNodeForInt curNode = head;
		while(curNode != null) {
			if( curNode.info == val)
				return i;
			curNode = curNode.next;
			i++;
		}
		return -1;
	}
	public int get(int idx) { // O(idx)
		// return the value at the given index
	}
	public int set(int idx, int val) { // O(idx)
		// set the node's value at the given index with given value
	}
	public void insertAt(int idx, int val) { // O(idx)
		// insert a node of given value at the given index while pushing some nodes to the right
	}
	public void repeatEach() { // O(numElements)
		// copy each element of the list and put it after each element.
		// FOr example, (10, -3, 35) becomes (10, 10, -3, -3, 35, 35).
	}
	public int remove(int val) { // O(numElements)
		// remove a node with given value if any
		// I will help with this in class Monday
	}
	public int removeAll(int val) { // O(numElements)
		// remove all the nodes with given value
		// This is a bonus problem. You are welcome to challenge though.
	}
	public boolean isFull() { // O(1)
		// This is complete. Nothing need to be done here.
		return false;
	}
	public boolean isEmpty() { // O(1)
		// return true if the list is empty. return false if not.
	}
	public int size() { // O(1)
		// return number of elements in the list
	}
	public void clear() {
		// remove all the elements in the list.
	}
	public int[] toArray() { // O(numElements)
		// return an array that contains all the elements(numbers) in the list
	}
	public MyLinkedList clone() { // O(numElements)
		// return a copy of 'this' object.
	}
}

package homework6;

public class SLLNode <T> {
	T info;
	SLLNode<T> next;
	public SLLNode(T info) {
		this.info = info;
		next = null;
	}
}

package tree;

public class BSTNode<T>
{
	T info;
	BSTNode<T> left;
	BSTNode<T> right;
	
	public BSTNode(T val)
	{
		info = val;
		left = null;
		right = null;
	}
}
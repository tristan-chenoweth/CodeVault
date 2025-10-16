package tree;

public class BSTNodeDemo
{
	public static void preOrder(BSTNode<Integer> node)
	{
		if (node == null)
		{
			return;
		}
		
		System.out.print(node.info + " ");
		
		preOrder(node.left);
		preOrder(node.right);
	}
	
	public static void inOrder(BSTNode<Integer> node)
	{
		if (node == null) 
		{
			return;
		}
		
		inOrder(node.left);
		System.out.print(node.info + " ");
		inOrder(node.right);	
	}
	
	public static void main(String[] args)
	{
		BSTNode<Integer> node1 = new BSTNode<Integer>(10);
		BSTNode<Integer> node2 = new BSTNode<Integer>(20);
		BSTNode<Integer> node3 = new BSTNode<Integer>(30);
		BSTNode<Integer> node4 = new BSTNode<Integer>(40);
		BSTNode<Integer> node5 = new BSTNode<Integer>(50);
		BSTNode<Integer> node6 = new BSTNode<Integer>(60);
		node4.left = node2;
		node4.right = node6;
		node2.left = node1;
		node2.right = node3;
		node6.left = node5;
		
//		preOrder(node4);
		inOrder(node4);	System.out.println();
		inOrder(node2);
	}
}
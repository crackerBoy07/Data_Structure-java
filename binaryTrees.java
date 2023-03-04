//preOrder, inOrder, postOrder
/*
public class binaryTrees {
	
	private Node root;
	
	private class Node {
		private int data;
		private Node left, right;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
        public void createBT() {
		Node first = new Node(9);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		root = first;
		first.left = second;
		first.right = third;
		
		second.left = fourth;
	}  
	
	//recursive method
    public void  preOrder(Node root) {
    	if(root == null) {
    		return;
    	}
    	System.out.print(root.data + " ");
    	preOrder(root.left);
    	preOrder(root.right);
    }  
	
	//recursive method
	public void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	//recursive method
	public void postOrder(Node root) {
		if(root == null) {
			return;
		}
		
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}  
	


	public static void main(String[] args) {
		binaryTrees bt = new  binaryTrees();
		bt.createBT();
		bt.postOrder(bt.root);
	}

}*/



//Print views(left, right, top, Bottom) in Binary Tree



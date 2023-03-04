public class singlyLinkedList {
	private Node head; //instance variable
	
	private static class Node {
		private int data;
		private Node next;
	
	private Node(int data) {
		this.data = data;
		this.next = null;
	}
}
	
	//insert at begining
	public void insertFirst(int value) {
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	
	//insert at end
	public void insertLast(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
			return;
		}
		Node current = head;
		while(current.next != null) {
			current = current.next;
		}
		current.next = newNode;
	}
	
	//insert at a given position
	public void insert(int pos, int value) {
		Node no = new Node(value);
		if(pos == 1) {
			no.next = head;
			head = no;
		} else {
			Node previous = head;
			int count = 1;
			while(count < pos - 1) {
				previous = previous.next;
				count++;
			}
			Node current = previous.next;
			previous.next = no;
			no.next = current;
		}
	}
	
	//delete first Node
	public Node deleteFirst() {
		if(head == null) {
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	
	//delete last Node
	public Node deleteLast() {
		if(head == null || head.next == null) {
			return head;
		}
		Node current = head;
		Node previous = null;
		while(current.next != null) {
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	
	//delete node at given position
	public void delete(int pos) {
		if(pos == 1) {
			head = head.next;
		} else {
			Node previous = head;
			int count = 1;
			while(count < pos - 1) {
				previous = previous.next;
				count++;
			}
			Node current = previous.next;
			previous.next = current.next;
		}
	}
	
/*	//reverse sll
	public Node reverse() {
		if(head == null) {
			return head;
		}
		Node current = head;
		Node previous = null;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}                                     */

	//print elements in sll
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data+ " --> ");
			current = current.next;
		}
		System.out.print("null");		
	}
	
	//length of sll
	public int length() {
		if(head == null) {
			return 0;
		}
		int count = 0;
		Node current = head;
		while(current != null) {
			count++;
			current = current.next;
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		singlyLinkedList sll = new singlyLinkedList();
		
		
		sll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		
		//now we will connect them together to form a chain
		sll.head.next = second; //1 --> 2
		second.next = third; //1 --> 2 --> 3
		third.next = fourth; //1 --> 2 --> 3 --> 4 --> null     
		
		sll.display();
	}
}
		
		


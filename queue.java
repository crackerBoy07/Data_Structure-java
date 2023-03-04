import java.util.*;

public class queue {
	
	private Node front;
	private Node rear;
	private int length;
	
	public queue() {
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	
	private class Node {
		private int data;
		private Node next; 
		
		private Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void enqueue(int data) {
		Node temp = new Node(data);
		if(isEmpty()) {
			front = temp;
		} else {
			rear.next = temp;
		}
		rear = temp;
		length++;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue is Already Empty");
		}
		int result = front.data;
		front = front.next;
		if(front == null) {
			rear = null;
		}
		length--;
		return result;
	}
	
	public void print() {
		if(isEmpty()) {
			return;
		}
		Node current = front;
		while(current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

	public static void main(String[] args) {
		queue q = new queue();
		q.enqueue(10);
		q.enqueue(15);
		q.enqueue(20);
		q.enqueue(25);
		q.print();
		q.dequeue();
		q.print();
	}

}

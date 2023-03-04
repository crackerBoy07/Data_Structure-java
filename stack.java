import java.util.EmptyStackException;

public class stack {
	
		private Node top;
		private int length;
		
		private class Node {
			private int data;
			private Node next;
			
			public Node(int data) {
				this.data = data;
			}
		}

		public stack() {
			top = null;
			length = 0;
		}
		
		public int length() {
			return length;
		}
		
		public boolean isEmpty() {
			return length == 0;
		}
		
		public void push(int data) {
			Node temp = new Node(data);
			temp.next = top;
			top = temp;
			length++;
		}
		
		public int pop() {
			if(isEmpty()){
				throw new EmptyStackException();
			}
			int result = top.data;
			top = top.next;
			length--;
			return result;
		}
		
		public int peek() {
			if(isEmpty() ) {
				throw new EmptyStackException();
			}
			return top.data;
		}
	public static void main(String[] args) {
		stack s = new stack();
		s.push(10);
		s.push(15);
		s.push(90);

		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
		s.pop();
		System.out.println(s.peek());
	}

}

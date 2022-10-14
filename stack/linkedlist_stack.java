import java.util.EmptyStackException;

public class Stack {

	public ListNode top;
	public int length;
	
	public class ListNode {
		public int data;
		public ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}
	}
	
	public Stack() {
		top = null;
		length = 0;
	}
	
  // return length of the list
	public int  length() {
		return length();
	}
	
  // Return true if stack is empty
	public boolean isEmpty() {
		return length == 0;
	}
	
	// Push a value in the list
	public void push(int data) {
		ListNode temp = new ListNode(data);
		temp.next = top;
		top = temp;
		length++;
	}
	
	// Delete the last value in
	public void pop() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		
		 top = top.next;
		 length--;
	}
	
	// Return the top value
	public int peek() {
		if (isEmpty()) {
			throw new EmptyStackException();
		}
		return top.data;
	}
	
	public static void main(String[] args) {

		Stack stack = new Stack();
    
	}

}

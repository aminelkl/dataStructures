package stack_array;

public class Stack {

	int stack[] = new int[5];
	int peek = -1;
	
	public void push(int data) {
		if (peek == 5) {
			System.out.println("Overflow");
		}

		else {
			 peek++;
			 stack[peek] = data;
		}
	}
	
	public void pop() {
		if (peek == -1) {
			System.out.println("Underflow");
		}
		else {
			peek--;	
		}
	}
	
	public void display() {
		System.out.println("Displayed from the top\n");
		for (int i = peek ; i > -1 ; i--) {
			System.out.println(stack[i]);
		}
	}
	
	public void peek() {
		if (peek == -1) {
			System.out.println("List is empty");
		}
		else {
			System.out.println(stack[peek]);
		}
	
	}
}
   

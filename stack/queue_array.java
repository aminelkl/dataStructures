package queue_array;

// First in first out	

public class Queue {

	int size = 5;
	int[] queue = new int[size];
	int front = -1;
	int rear = -1; 
	
	public void enqueue(int data) {
		if (rear == size -1) {
			System.out.println("Overflow");
		}
		else if (rear == -1 && front == -1){
			front = 0;
			rear = 0;
			queue[rear] = data;
			   
		}
		else {
			rear++;
			queue[rear] = data;
		}
	}
	
	public void dequeue() {
		if (rear == -1 && front == -1) {
			System.out.println("Can't dequeue, list is empty");
		}
		else if (rear == front){
			rear = -1;
			front = -1;
		}
		else  {
			front++;
		}
	}
	
	public void display() {
		if (rear == -1 && front == -1) {
			System.out.println("Queue is empty");
		}
		else {
			System.out.println("Queue is displayed from the front :");
			for (int i = front ; i <= rear ; i++) {
				System.out.println(queue[i]);
			}
		}
	}
	
	public void peek() {
		if (front == -1 && rear == -1) {
			System.out.println("queue is empty");
		}
		else {
			System.out.println("Peek is : " + queue[front]);
		}
	}
}

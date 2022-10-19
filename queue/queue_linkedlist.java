package queue_linkedlist;

public class Queue {

     ListNode front = null; 
	 ListNode rear = null;
	
	 
	 public class ListNode {
		 int data;
		 ListNode next;
		 
		 ListNode(int data) {
			 this.data = data;
		 }
	 }
	 
	 void enqueue (int data) {
		 ListNode node = new ListNode(data);
		 
 		 if (front == null && rear == null) {
 			 front = node; 
 			 rear = node;
 		 }
 		 else {
 			  rear.next = node;
 			  rear = node;
 		 }
	 }
	 
	 void display () {
		 if (front == null && rear == null) {
 			System.out.println("Queue is empty");
 		 }
		 else {
			 System.out.println("Data are displayed from the top");
			 ListNode temp = front;
			 while (temp != null) {
				 System.out.println(temp.data);
				 temp = temp.next; 
			 } 
		 }
	 }
	 
	 void dequeue () {
		 if (front == null && rear == null) {
			 System.out.println("List is empty");
		 }
		 else {
			 front = front.next;
		 }
	 }
	 
	 void peek () {
		 if (front == null && rear == null) {
			 System.out.println("List is empty");
		 }
		 else {
			 System.out.println(front.data);
		 }
	 }
	 
}


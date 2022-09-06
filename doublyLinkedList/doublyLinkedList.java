import java.util.NoSuchElementException;

public class doublyLinkedList {

	Node head;
	Node tail;
	int size;
	
	public doublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return (this.size == 0);
	}
	
	public int getSize() {
		return this.size;
	}

	public void printListAsc() {
		if (head == null) {
			return;
		}
		
		Node node = new Node();
		node = head;
		
		while (node.next != null) {
			System.out.println(node.data + "-->");
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public void printListDesc() {
	
		if (head == null) {
			return;
		}
		
		Node node = new Node();
		node = tail;
		
		while (node.previous != null) {
			System.out.print(node.data + "--> ");
			node = node.previous;
		}
		System.out.print(node.data);
		
	}
	
	public void insertAtFirst(int value) {
        Node newNode = new Node();
        newNode.data = value;
        
        if (isEmpty()) {
        	tail = newNode;
        }
        else {
        	head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
	}
	
	public void deleteFirst() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		
	    Node temp = head;
		if (head == tail) {
		tail = null;	 
		}
		else {
			 head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		size--;
	}
	
	public void insertAtEnd(int value) {
		Node newNode = new Node();
		newNode.data = value;
		
		if (isEmpty()) {
			head = newNode;
		}
		else {
			tail.next = newNode;
			newNode.previous = tail;
		}
		 tail = newNode;
		 size++;
	}
	
	public void deleteAtEnd() {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		
		Node temp = tail;
		if (head == tail) {
			head = null;
		}
		else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		size--;
	}
	
	public void insertAt(int value, int position) {
		Node newNode = new Node();
		newNode.data = value; 
		
		if (position == 0) {
			insertAtFirst(value);
			return;
		}
		else if (position == size) {
			insertAtEnd(value);
			return;
		}
		else {
			Node travelNode = head;
		    for (int i = 1 ; i < position ; i++) {
		    	travelNode = travelNode.next;
		    }
		    Node temp = travelNode.next;
		    travelNode.next = newNode;
		    newNode.previous = travelNode;
		    newNode.next = temp;
		    temp.previous = newNode;
			}
		size++;
	}
	
	public void deleteAt(int position) {
		if (position > size - 1) {
			System.out.println("Can't delete, this element does not exist!");
			size--;
			return;
		}
		
		if (position == 0) {
			deleteFirst();
			return;
		}
		else if (position == size - 1) {
			deleteAtEnd();
			return;
		}
		
		Node travelNode = head;
		for (int i = 0 ; i < position ; i++ ) {
			travelNode = travelNode.next;
		}
		Node previous = travelNode.previous; 
		Node next = travelNode.next;
		
		previous.next = next;
		next.previous = previous;
		size--;
	}
	

}

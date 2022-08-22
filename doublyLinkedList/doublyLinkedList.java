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
	
	public void insertAtEnd() {
		
	}

}

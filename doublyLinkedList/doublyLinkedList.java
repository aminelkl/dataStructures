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
		
	}
	
	
    


}

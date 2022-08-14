/*
Test case 
expected output : [10, 9, 8, 7, 6, 5, 4, 3, 1]
*/

public static void main(String[] args) {

		LinkedList linky = new LinkedList();
		
		linky.insertAtEnd(1);
		linky.insertAtEnd(2);
		linky.insertAtEnd(3);
		linky.insertAtEnd(4);
		linky.insertAtEnd(5);
		linky.insertAtEnd(6);
		linky.insertAtEnd(7);
		linky.insertAtEnd(8);
		
	    linky.insertAtFirst(0);
	    
	    linky.insertAt(10, 9);
	    linky.insertAt(9, 9);
	    
	    linky.removeFirst();
	    linky.removeAt(1);
	    
	    linky.reverse();
	}

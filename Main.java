
public class Main {

	public static void main(String[] args) {
		  LinkedList linkedList = new LinkedList();

	        // Add nodes to the list
		  linkedList.insertAtPos(10, 1);
		  linkedList.insertAtPos(22, 2);
		  linkedList.insertAtPos(32, 3);
		  linkedList.insertAtPos(45, 4);
		  linkedList.insertAtPos(50, 5);

	        //a Inserting a new node at position 2
		  linkedList.insertAtPos(4, 2);
		  System.out.println("linked list after insertion of 4 at position 2");
	        // Print the updated list
		  linkedList.display();
		  System.out.println();
		// b Delete node at position 4
		  linkedList.deleteAtPosition(3); 
		  
	        System.out.println("linked list after deletion at position 3");
	            
			  linkedList.display();
			  System.out.println();
			 // c Delete the node after the node with data 2
			  linkedList.deleteAfterNode(linkedList.head.next); // Assuming head.next is the node with data 2
			  System.out.println("linked list after deletion after a node with data 4");
	            
		        // Print the updated list
			  linkedList.display();
			  System.out.println();
	
			  //d searching a node in a singly linked list
			  // Search for a node with data 45
		        boolean data = linkedList.searchNode(20);

		        if (data) {
		            System.out.println("Node found in the linked list.");
		        } else {
		            System.out.println("Node not found in the linked list.");
		        }
		    }
		

	  
	}
	

		
	



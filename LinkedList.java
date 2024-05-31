

public class LinkedList {
	Node head;// head of list
	public void insertAtPos(int data, int position) { // method to insert a node at any given position
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node current = head;
        for (int i = 1; current != null && i < position - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position does not exist.");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
    }
	
	
	
	
	void deleteAtPosition(int position) // method to delete a node at a given position
    {
        // If linked list is empty
        if (head == null)
            return;
 
        // Store head node
        Node temp = head;
 
        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }
 
        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1;
             i++)
            temp = temp.next;
 
        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;
 
        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;
 
        temp.next
            = next; // Unlink the deleted node from list
    }
 
    /* This function prints contents of linked list starting
       from the given node */
	// Function to delete the node after a given node
    
	
	
	
	
	public void deleteAfterNode(Node prevNode) { // method to delete a node after a give node
        if (prevNode == null || prevNode.next == null) {
            System.out.println("Previous node or next node is null.");
            return;
        }

        Node nextNode = prevNode.next;
        prevNode.next = nextNode.next;
        nextNode = null; // Remove the reference to the deleted node
    }
	
	
	
	
	// Function to search for a node in the linked list
    public boolean searchNode(int data) {
        Node current = head;

        while (current != null) {
            if (current.data == data) {
                return true; // Node found
            }
            current = current.next;
        }

        return false; //  which implies Node not found
    }
	
	
	// Function to print the linked list
    public void display() {
        Node node1 = head;
        while (node1 != null) {
            System.out.print(node1.data + " ");
            node1 = node1.next;
        }
    }
		
}
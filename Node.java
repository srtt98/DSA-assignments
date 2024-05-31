
public class Node {
	// Node class represents a single node in the linked list
	
	    private Task task;  // The task associated with this node
	    private Node next;  // Reference to the next node in the list

	    public Node(Task task) {
	        this.task = task;
	    }

	    public Task getTask() {
	        return task;
	    }

	    public Node getNext() {
	        return next;
	    }

	    public void setNext(Node next) {
	        this.next = next;
	    }
	}

	// Task class represents a single task in the to-do list
	class Task {
	    private String description;  // The description of the task
	    private boolean completed;  // Whether the task is completed or not

	    public Task(String description) {
	        this.description = description;
	        this.completed = false;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public boolean isCompleted() {
	        return completed;
	    }

	    public void setCompleted(boolean completed) {
	        this.completed = completed;
	    }
	}

	// ToDoList class manages a linked list of tasks
	class ToDoList {
	    private Node head;  // Reference to the first node in the list

	    // Adds a new task to the end of the list
	    public void addToDo(Task task) {
	        if (head == null) {
	            head = new Node(task);
	        } else {
	            Node current = head;
	            while (current.getNext() != null) {
	                current = current.getNext();
	            }
	            current.setNext(new Node(task));
	        }
	    }

	    // Removes a task from the list by its description
	    public void removeTask(String description) {
	        if (head == null) {
	            return;
	        }

	        if (head.getTask().getDescription().equals(description)) {
	            head = head.getNext();
	            return;
	        }

	        Node current = head;
	        while (current.getNext() != null) {
	            if (current.getNext().getTask().getDescription().equals(description)) {
	                current.setNext(current.getNext().getNext());
	                return;
	            }
	            current = current.getNext();
	        }
	    }

	    // Marks a task as completed by its description
	    public void markTaskCompleted(String description) {
	        if (head == null) {
	            return;
	        }

	        Node current = head;
	        while (current != null) {
	            if (current.getTask().getDescription().equals(description)) {
	                current.getTask().setCompleted(true);
	                return;
	            }
	            current = current.getNext();
	        }
	    }

	    // Prints the to-do list
	    public void viewToDoList(){
	        Node current = head;
	        while (current != null) {
	            String status = current.getTask().isCompleted() ? "Completed" : "Pending";
	            System.out.println(current.getTask().getDescription() + " - " + status);
	            current = current.getNext();
	        }
	    }
	}

	
	    



public class Main {
	public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();

        // Add some tasks to the list
        toDoList.addToDo(new Task("go to library "));
        toDoList.addToDo(new Task("Finish your project"));
        toDoList.addToDo(new Task("visit your friends ")); 

        // Print the list
        System.out.println("To-Do List:");
        toDoList.viewToDoList();

        // Mark a task as completed
        toDoList.markTaskCompleted("Finish homework");

        // Print the list again
        System.out.println("\nTo-Do List after marking a task as completed:");
        toDoList.viewToDoList();

        // Remove a task from the list
        toDoList.removeTask("Call the doctor");
        toDoList.viewToDoList();

        // Print
    }
}

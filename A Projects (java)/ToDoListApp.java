import java.util.ArrayList;
import java.util.Scanner;

class Task {
    private String name;
    private String description;
    private String dueDate;
    private boolean completed;

    public Task(String name, String description, String dueDate) {
        this.name = name;
        this.description = description;
        this.dueDate = dueDate;
        this.completed = false;//default is false
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        String status = completed ? "[Completed]" : "[Incomplete]";
        return status + " " + name + " (Due: " + dueDate + ")";
    }
}

public class ToDoListApp {
    private static ArrayList<Task> taskList = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the To-Do List Application!");

        while (true) {
            System.out.println("1. Add Task\n2. View all Tasks\n3. Mark Task as Completed\n4. Remove Task\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    markTaskAsCompleted();
                    break;
                case 4:
                    removeTask();
                    break;
                case 5:
                    System.out.println("Exiting the application. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    private static void addTask() {
        System.out.print("Enter task name: ");
        String name = sc.nextLine();
        System.out.print("Enter task description: ");
        String description = sc.nextLine();
        System.out.print("Enter due date: ");
        String dueDate = sc.nextLine();

        Task t1 = new Task(name, description, dueDate);
        taskList.add(t1);
        System.out.println("Task added successfully!");
    }

    private static void viewTasks() {
        System.out.println("--- Task List ---");
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println((i + 1) + ". " + taskList.get(i));
        }
    }

    private static void markTaskAsCompleted() {
        viewTasks();
        System.out.print("Enter the task number to mark as completed: ");
        int taskNumber = sc.nextInt();
        if (taskNumber >= 1 && taskNumber <= taskList.size()) {
            Task task = taskList.get(taskNumber - 1);
            task.markAsCompleted();
            System.out.println("Task marked as completed!");
        } 
        else {
            System.out.println("Invalid task number.");
        }
    }

    private static void removeTask() {
        viewTasks();
        System.out.print("Enter the task number to remove: ");
        int taskNumber = sc.nextInt();
        if (taskNumber >= 1 && taskNumber <= taskList.size()) {
            taskList.remove(taskNumber - 1);
            System.out.println("Task removed successfully!");
        } else {
            System.out.println("Invalid task number.");
        }
    }
}

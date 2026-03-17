import java.util.ArrayList;
import java.util.Scanner;

class TodoApp {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<String> status = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== TO-DO LIST MENU =====");
            System.out.println("1. Add Task");
            System.out.println("2. Show Tasks (New Page)");
            System.out.println("3. Mark Task as Done");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {

                case 1:
                    System.out.print("Enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    status.add("Pending");
                    System.out.println("Task Added!");
                    break;

                case 2:
                    System.out.println("\n===== YOUR TASKS =====");
                    if (tasks.size() == 0) {
                        System.out.println("No tasks available!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i) + " [" + status.get(i) + "]");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task number to mark as done: ");
                    int done = sc.nextInt();
                    if (done > 0 && done <= tasks.size()) {
                        status.set(done - 1, "Done");
                        System.out.println("Task marked as Done!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;

                case 4:
                    System.out.print("Enter task number to delete: ");
                    int del = sc.nextInt();
                    if (del > 0 && del <= tasks.size()) {
                        tasks.remove(del - 1);
                        status.remove(del - 1);
                        System.out.println("Task Deleted!");
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);
    }
}
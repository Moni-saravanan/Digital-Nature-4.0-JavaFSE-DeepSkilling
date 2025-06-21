import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int taskId;
        String taskName;
        String status;
        while (true) {
            System.out.println("Task Management System" +
                    "\n1. Add" +
                    "\n2. Delete" +
                    "\n3. Traverse" +
                    "\n4. Search");
            System.out.print("Enter your choice: ");
            int ch=io.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Task ID: ");
                    taskId=io.nextInt();
                    io.nextLine();
                    System.out.print("Task Name: ");
                    taskName=io.nextLine();
                    System.out.print("Status: ");
                    status=io.nextLine();
                    Node.add(taskId,taskName,status);
                    break;
                case 2:
                    System.out.print("Task ID to delete: ");
                    taskId=io.nextInt();
                    Node.delete(taskId);
                    break;
                case 3:
                    Node.display();
                    break;
                case 4:
                    System.out.print("Task ID: ");
                    taskId=io.nextInt();
                    Node.search(taskId);
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        while (true) {
            System.out.println("\nEmployee Management System:");
            System.out.println("1. Add Employee");
            System.out.println("2. Delete Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = io.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Employee ID: ");
                    int id = io.nextInt();
                    System.out.print("Name: ");
                    String name = io.next();
                    System.out.print("Position: ");
                    String position = io.next();
                    System.out.print("Salary: ");
                    double salary = io.nextDouble();

                    Employee newEmp = new Employee(id, name, position, salary);
                    ems.addEmployee(newEmp);
                    break;

                case 2:
                    System.out.print("Employee ID: ");
                    int delId = io.nextInt();
                    ems.deleteEmployee(delId);
                    break;

                case 3:
                    System.out.print("Employee ID: ");
                    int searchId = io.nextInt();
                    Employee found = ems.searchEmployee(searchId);
                    if (found != null) {
                        found.displayInfo();
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 4:
                    ems.listEmployees();
                    break;

                case 5:
                    System.out.println("Bye..");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

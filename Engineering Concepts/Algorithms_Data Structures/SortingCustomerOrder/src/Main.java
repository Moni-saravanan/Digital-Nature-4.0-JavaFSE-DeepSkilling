
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int OrderId;
        String OrderName;
        double totalPrice;
        System.out.print("Enter number of Orders: ");
        int n = io.nextInt();
        Order[] order = new Order[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Order ID: ");
            OrderId = io.nextInt();
            System.out.print("Order name: ");
            OrderName = io.next();
            System.out.print("Total price: ");
            totalPrice = io.nextDouble();
            Order o = new Order(OrderId, OrderName, totalPrice);
            order[i] = o;
        }
        while (true) {
            System.out.println("Sorting Operation");
            System.out.println("1. Bubble sort\n2. Quick sort\n3. Exit");
            System.out.print("Enter your choice(1/2/3): ");
            int ch = io.nextInt();
            switch (ch) {
                case 1:
                    BubbleSort.sort(order);
                    break;
                case 2:
                    QuickSort.sort(order, 0, n - 1);
                    System.out.println("Sorted using Quick Sort:");
                    QuickSort.printOrders(order);
                    break;
                case 3:
                    System.out.println("Bye...");
                    return;
                default:
            }
        }
    }
}

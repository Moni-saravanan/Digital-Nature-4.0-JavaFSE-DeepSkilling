import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        LinearSearch l=LinearSearch.getInstance();
        BinarySearch b=BinarySearch.getInstance();
        int productId;
        String productName;
        String category;
        int quantity;
        double amount;
        System.out.print("Enter number of Elements: ");
        int n=io.nextInt();
        Product[] product=new Product[n];
        for(int i=0;i<n;i++) {
            System.out.print("Product ID: ");
            productId= io.nextInt();
            System.out.print("Product Name: ");
            productName=io.next();
            System.out.print("Category: ");
            category=io.next();
            System.out.print("Quantity: ");
            quantity=io.nextInt();
            System.out.print("Amount: ");
            amount=io.nextDouble();
            Product p=new Product(productId, productName, category, quantity, amount);
            product[i]=p;
            System.out.println("Added successfully");
        }
        while (true) {
            System.out.println("Searching Operation");
            System.out.println("1. Linear search\n2. Binary search\n3. Exit");
            System.out.print("Enter your choice: ");
            int ch=io.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Search product: ");
                    productName=io.next();
                    System.out.println(l.linearSearch(product, productName));
                    break;
                case 2:
                    System.out.print("Search product: ");
                    productName=io.next();
                    System.out.println(b.binary(product, productName));
                    break;
                case 3:
                    System.out.println("Bye...");
                    return;
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}
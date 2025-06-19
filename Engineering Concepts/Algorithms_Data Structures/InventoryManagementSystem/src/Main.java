import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static HashMap<Integer, Product> productList=new HashMap<>();
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        int productId;
        String productName;
        int quantity;
        double price;
        while (true) {
            System.out.println("Inventory Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Update Product");
            System.out.println("3. Delete Products");
            System.out.print("Enter your choice: ");
            int op=io.nextInt();
            switch (op) {
                case 1:
                    System.out.print("Product ID: ");
                    productId=io.nextInt();
                    System.out.print("Product Name: ");
                    productName=io.next();
                    System.out.print("Quantity: ");
                    quantity=io.nextInt();
                    System.out.print("Price: ");
                    price=io.nextDouble();
                    System.out.println(AddProduct.add(productId,productName,quantity,price));
                    break;
                case 2:
                    System.out.print("Product ID: ");
                    productId=io.nextInt();
                    System.out.print("Quantity: ");
                    quantity=io.nextInt();
                    System.out.print("Price: ");
                    price=io.nextDouble();
                    System.out.println(UpdateProduct.update(productId, quantity, price));
                    break;
                case 3:
                    System.out.print("Product ID: ");
                    productId=io.nextInt();
                    System.out.println(DeleteProduct.delete(productId));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}
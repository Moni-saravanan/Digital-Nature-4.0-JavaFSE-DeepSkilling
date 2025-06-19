public class Product {
    int productId;
    String productName;
    String category;
    int quantity;
    double amount;

    public Product(int productId, String productName, String category, int quantity, double amount) {
        this.productId=productId;
        this.productName=productName;
        this.category=category;
        this.quantity=quantity;
        this.amount=amount;
    }
}

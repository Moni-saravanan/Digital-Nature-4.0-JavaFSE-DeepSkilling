public class AddProduct {
    public static String add(int productId, String productName, int quantity, double price) {
        Product p=new Product(productId, productName, quantity ,price);
        Main.productList.put(productId, p);
        return "Product "+Main.productList.get(productId).productName+" added";
    }
}

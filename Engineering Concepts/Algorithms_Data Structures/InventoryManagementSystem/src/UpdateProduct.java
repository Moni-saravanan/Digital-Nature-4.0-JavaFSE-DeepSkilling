public class UpdateProduct {

    public static String update(int productId, int quantity, double price) {
        if(Main.productList.containsKey(productId)) {
            Main.productList.get(productId).quantity=quantity;
            Main.productList.get(productId).price=price;
        }
        else{
            return "No Product found";
        }
        return "Product "+Main.productList.get(productId).productName+" Updated Successfully";
    }
}

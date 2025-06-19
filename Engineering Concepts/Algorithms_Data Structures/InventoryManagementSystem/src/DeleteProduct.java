public class DeleteProduct {
    public static String delete(int productId) {
        if(Main.productList.containsKey(productId)) {
            Main.productList.remove(productId);
        }
        return "Product Deleted Successfully";
    }
}

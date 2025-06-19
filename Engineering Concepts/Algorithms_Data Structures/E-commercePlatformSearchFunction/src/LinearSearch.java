public class LinearSearch {
    private LinearSearch() {

    }
    public static LinearSearch getInstance() {
        return new LinearSearch();
    }
    public String linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return "Product ID: "+products[i].productId+"\nProduct name: "+products[i].productName+
                        "\ncategory: "+products[i].category+"\nQuantity: "+products[i].quantity+"\nPrice: "+products[i].amount;

            }
        }
        return null;
    }
}

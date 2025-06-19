import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    private BinarySearch() {

    }
    public static BinarySearch getInstance() {
        return new BinarySearch();
    }
    public String binary(Product[] products, String name) {
        Arrays.sort(products, new Comparator<Product>() {
            public int compare(Product p1, Product p2) {
                return p1.productName.compareToIgnoreCase(p2.productName);
            }
        });
        int low = 0, high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compare = name.compareToIgnoreCase(products[mid].productName);

            if (compare == 0)
                return "Product ID: "+products[mid].productId+"\nProduct name: "+products[mid].productName+
                        "\ncategory: "+products[mid].category+"\nQuantity: "+products[mid].quantity+"\nPrice: "+products[mid].amount;
            else if (compare < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return null;



    }
}

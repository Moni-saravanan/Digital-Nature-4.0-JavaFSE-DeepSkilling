import java.util.Arrays;
import java.util.Comparator;

public class BinarySearch {
    public static void searchByTitle(Book[] b, String title) {
        Arrays.sort(b, Comparator.comparing(a->a.title.toLowerCase()));
        int n=b.length;
        int low=0, high=n-1;
        while (low<=high) {
            int mid=(low+high)/2;
            int cmp=b[mid].title.compareToIgnoreCase(title);
            if(cmp==0){
                System.out.println("Book ID: "+b[mid].bookId+
                        "\nTitle: "+b[mid].title+
                        "\nAuthoer: "+b[mid].author);
                System.out.println("---------------------------");
            }
            if(cmp>0) {
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
    }
}

public class LinearSearch{

    public static void searchByTitle(Book[] books, String title) {
        int n=books.length;
        for (int i=0;i<n;i++) {
                if(books[i].title.equalsIgnoreCase(title)) {
                    System.out.println("Book ID: "+books[i].bookId+
                            "\nTitle: "+books[i].title+
                            "\nAuthoer: "+books[i].author);
                    System.out.println("---------------------------");

            }
        }
    }
}

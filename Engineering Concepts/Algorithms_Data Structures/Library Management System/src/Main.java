import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner io=new Scanner(System.in);
        System.out.print("Number of Books: ");
        int n=io.nextInt();
        Book books[]=new Book[n];
        for (int i=0;i<n;i++) {
            System.out.print("Book ID: ");
            int bookId= io.nextInt();
            io.nextLine();
            System.out.print("Title: ");
            String title=io.nextLine();
            System.out.print("Author: ");
            String author=io.nextLine();
            Book b=new Book(bookId, title, author);
            books[i]=b;
        }
        System.out.print("Enter title to search: ");
        String find=io.next();
        System.out.println("Linear Search");
        LinearSearch.searchByTitle(books, find);
        System.out.println("Binary Search");
        BinarySearch.searchByTitle(books, find);
    }
}

// OnlineBookstore.java
import java.util.*;

class Book {
    String title;
    double price;

    Book(String t, double p) {
        title = t;
        price = p;
    }
}

public class OnlineBookstore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = List.of(new Book("Java Basics", 300),
                new Book("Spring Boot", 450),
                new Book("DSA in Java", 500));
        double total = 0;
        while (true) {
            System.out.println("\nAvailable Books:");
            for (int i = 0; i < books.size(); i++)
                System.out.println((i + 1) + ". " + books.get(i).title + " ₹" + books.get(i).price);
            System.out.println("4. Checkout  5. Exit");
            int ch = sc.nextInt();
            if (ch >= 1 && ch <= 3) {
                total += books.get(ch - 1).price;
                System.out.println("Added to cart!");
            } else if (ch == 4)
                System.out.println("Total Bill: ₹" + total);
            else if (ch == 5)
                return;
        }
    }
}

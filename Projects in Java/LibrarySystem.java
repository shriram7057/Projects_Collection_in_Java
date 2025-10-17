
// LibrarySystem.java
import java.util.*;

class BookRec {
    String title;
    boolean issued;

    BookRec(String t) {
        title = t;
        issued = false;
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BookRec> books = new ArrayList<>(List.of(new BookRec("Java"), new BookRec("C++"), new BookRec("Python")));
        while (true) {
            System.out.println("\n1.View Books 2.Issue Book 3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                for (int i = 0; i < books.size(); i++)
                    System.out.println((i + 1) + ". " + books.get(i).title + (books.get(i).issued ? " (Issued)" : ""));
            } else if (ch == 2) {
                System.out.print("Enter book number: ");
                int b = sc.nextInt();
                if (!books.get(b - 1).issued) {
                    books.get(b - 1).issued = true;
                    System.out.println("Book Issued!");
                } else
                    System.out.println("Already issued!");
            } else
                return;
        }
    }
}

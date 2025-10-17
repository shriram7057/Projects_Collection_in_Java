
// SmartExpenseTracker.java
import java.util.*;

class Expense {
    String category;
    double amount;

    Expense(String category, double amount) {
        this.category = category;
        this.amount = amount;
    }
}   

public class SmartExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Expense> list = new ArrayList<>();
        double total = 0;

        while (true) {
            System.out.println("\n1. Add Expense  2. View Expenses  3. Total  4. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> {
                    System.out.print("Enter category: ");
                    String cat = sc.nextLine();
                    System.out.print("Enter amount: ");
                    double amt = sc.nextDouble();
                    list.add(new Expense(cat, amt));
                    total += amt;
                    System.out.println("✅ Expense added!");
                }
                case 2 -> {
                    System.out.println("\n--- Expense List ---");
                    list.forEach(e -> System.out.println(e.category + " : ₹" + e.amount));
                }
                case 3 -> System.out.println("💰 Total Spent: ₹" + total);
                case 4 -> {
                    System.out.println("👋 Exiting... Track your money wisely!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

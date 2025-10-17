
// TaskScheduler.java
import java.util.*;

class Task {
    String name;
    String time;

    Task(String n, String t) {
        name = n;
        time = t;
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Task> list = new ArrayList<>();
        while (true) {
            System.out.println("\n1.Add Task 2.View Tasks 3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                System.out.print("Enter Task: ");
                String name = sc.nextLine();
                System.out.print("Enter Time: ");
                String time = sc.nextLine();
                list.add(new Task(name, time));
            } else if (ch == 2) {
                System.out.println("\nToday's Tasks:");
                list.forEach(t -> System.out.println(t.time + " - " + t.name));
            } else
                return;
        }
    }
}


// StudentManagement.java
import java.util.*;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();

        while (true) {
            System.out.println("\n1.Add Student 2.View Students 3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            switch (ch) {
                case 1 -> {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    list.add(new Student(id, name, marks));
                }
                case 2 -> {
                    System.out.println("\nID\tName\tMarks");
                    list.forEach(s -> System.out.println(s.id + "\t" + s.name + "\t" + s.marks));
                }
                case 3 -> {
                    return;
                }
            }
        }
    }
}

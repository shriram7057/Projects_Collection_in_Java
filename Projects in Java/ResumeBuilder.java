
// ResumeBuilder.java
import java.util.*;

public class ResumeBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Skills: ");
        String skills = sc.nextLine();
        System.out.print("Enter Experience: ");
        String exp = sc.nextLine();
        System.out.println("\n--- Resume ---");
        System.out.println("Name: " + name);
        System.out.println("Skills: " + skills);
        System.out.println("Experience: " + exp);
        System.out.println("Resume Generated Successfully!");
    }
}

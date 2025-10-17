
// HospitalManagement.java
import java.util.*;

class Patient {
    int id;
    String name;
    String disease;

    Patient(int i, String n, String d) {
        id = i;
        name = n;
        disease = d;
    }
}

public class HospitalManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();
        while (true) {
            System.out.println("\n1.Add Patient 2.View Patients 3.Exit");
            int ch = sc.nextInt();
            sc.nextLine();
            if (ch == 1) {
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String n = sc.nextLine();
                System.out.print("Disease: ");
                String d = sc.nextLine();
                patients.add(new Patient(id, n, d));
            } else if (ch == 2) {
                System.out.println("\nID\tName\tDisease");
                patients.forEach(p -> System.out.println(p.id + "\t" + p.name + "\t" + p.disease));
            } else
                return;
        }
    }
}

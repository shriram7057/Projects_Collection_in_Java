
// WeatherApp.java
import java.util.*;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        while (true) {
            System.out.print("Enter city name (or exit): ");
            String city = sc.nextLine();
            if (city.equalsIgnoreCase("exit"))
                return;
            int temp = 20 + r.nextInt(15);
            System.out.println("Weather in " + city + ": " + temp + "°C, Sunny ☀️");
        }
    }
}

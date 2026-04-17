import java.util.*;

public class TrainConsistManagement {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Passenger bogies after addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("Passenger bogies after removal: " + passengerBogies);

        System.out.println("Is Sleeper present? " + passengerBogies.contains("Sleeper"));
    }
}
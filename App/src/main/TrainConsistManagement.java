import java.util.*;

public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};

        Arrays.sort(bogieNames);

        System.out.println("Sorted bogie names: " + Arrays.toString(bogieNames));
    }
}
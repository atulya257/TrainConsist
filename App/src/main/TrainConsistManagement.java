import java.util.*;

public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        String[] bogieNames = {"Sleeper", "AC Chair", "First Class", "Cargo", "Guard"};
        Arrays.sort(bogieNames);
        System.out.println("Sorted bogie names: " + Arrays.toString(bogieNames));

        String[] bogieIds = {"BG101", "BG205", "BG309", "BG410"};
        String searchKey = "BG309";

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie found: " + searchKey);
        } else {
            System.out.println("Bogie not found: " + searchKey);
        }
    }
}
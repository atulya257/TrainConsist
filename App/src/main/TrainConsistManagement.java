import java.util.*;

public class TrainConsistManagement {

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<String> bogieIds = new ArrayList<>();

        String searchKey = "BG101";

        if (bogieIds.isEmpty()) {
            throw new IllegalStateException("Cannot perform search: Train has no bogies");
        }

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
import java.util.*;
import java.util.function.*;

public class TrainConsistManagement {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        Predicate<GoodsBogie> safetyRule = b ->
                !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum");

        boolean isSafe = bogies.stream().allMatch(safetyRule);

        System.out.println("Safety compliant: " + isSafe);
    }
}
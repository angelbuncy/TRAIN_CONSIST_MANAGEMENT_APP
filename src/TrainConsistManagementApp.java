import java.util.HashMap;
import java.util.Map;

/**
 * UC6: Validate Bogie Data (Exception Handling)
 * This class introduces data validation to ensure the train's
 * inventory remains accurate and logical.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {
        Map<String, Integer> bogieInventory = new HashMap<>();

        System.out.println("=== Train Data Validation System ===\n");

        // Attempting to add various bogies
        registerBogie(bogieInventory, "BG201", 72);  // Valid
        registerBogie(bogieInventory, "", 50);       // Invalid ID
        registerBogie(bogieInventory, "BG202", -10); // Invalid Capacity
        registerBogie(bogieInventory, "BG203", 24);  // Valid

        System.out.println("\n--- Final Validated Inventory ---");
        System.out.println(bogieInventory);
    }

    /**
     * Helper method to validate and add bogies to the map.
     * Demonstrates basic manual exception handling logic.
     */
    public static void registerBogie(Map<String, Integer> map, String id, int capacity) {
        try {
            // 1. Validate ID
            if (id == null || id.trim().isEmpty()) {
                throw new IllegalArgumentException("Invalid ID: Bogie ID cannot be empty.");
            }

            // 2. Validate Capacity
            if (capacity <= 0) {
                throw new IllegalArgumentException("Invalid Capacity: Must be greater than 0 for ID " + id);
            }

            // 3. Add to Map if all checks pass
            map.put(id, capacity);
            System.out.println("Successfully Registered: " + id + " (" + capacity + " seats)");

        } catch (IllegalArgumentException e) {
            // Catching the error and printing a user-friendly message
            System.err.println("ALERT: Registration Failed! -> " + e.getMessage());
        }
    }
}
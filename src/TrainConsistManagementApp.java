import java.util.HashMap;
import java.util.Map;

/**
 * UC5: Map Bogie IDs to Capacity (HashMap)
 * This class simulates a database/lookup table for train bogies.
 * Key: Bogie ID (Unique) | Value: Capacity (Integer)
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 1. Initialize the HashMap
        // Map<KeyType, ValueType>
        Map<String, Integer> bogieInventory = new HashMap<>();

        System.out.println("=== Bogie Capacity Inventory System ===\n");

        // 2. Adding Data (Put operations)
        bogieInventory.put("BG101", 72); // Sleeper
        bogieInventory.put("BG102", 54); // AC Chair
        bogieInventory.put("BG103", 24); // First Class

        System.out.println("Inventory Updated: " + bogieInventory);

        // 3. Retrieving Data (Get operations)
        String searchId = "102"; // Let's check BG102
        if (bogieInventory.containsKey("BG" + searchId)) {
            int capacity = bogieInventory.get("BG" + searchId);
            System.out.println("Lookup: Bogie BG" + searchId + " has a capacity of " + capacity + " seats.");
        }

        // 4. Updating a Value
        // If a bogie is refurbished, we simply 'put' the new value over the old key
        System.out.println("\nAction: Refurbishing BG103 to increase capacity...");
        bogieInventory.put("BG103", 30);

        // 5. Final State Display
        System.out.println("\n--- Final Inventory Summary ---");
        for (Map.Entry<String, Integer> entry : bogieInventory.entrySet()) {
            System.out.println("Bogie ID: " + entry.getKey() + " | Capacity: " + entry.getValue());
        }
    }
}
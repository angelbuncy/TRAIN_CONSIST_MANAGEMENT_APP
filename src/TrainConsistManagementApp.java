import java.util.HashSet;
import java.util.Set;

/**
 * UC3: Track Unique Bogie IDs (Set – HashSet)
 * This class ensures that every bogie added to the system has a unique ID.
 * It demonstrates how HashSet handles duplicate data automatically.
 */
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 1. Initialize a HashSet to store unique Bogie IDs
        // We use the Set interface for abstraction
        Set<String> bogieIds = new HashSet<>();

        System.out.println("=== Train Bogie ID Registration ===");

        // 2. Adding Unique Bogie IDs
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");

        System.out.println("Initial IDs added: [BG101, BG102, BG103]");

        // 3. ATTEMPTING TO ADD DUPLICATES
        // In a List, this would create a second entry. In a Set, it is ignored.
        System.out.println("\nAttempting to add duplicate ID: BG101...");
        boolean isAdded = bogieIds.add("BG101");

        if (!isAdded) {
            System.out.println("Constraint Violated: ID 'BG101' already exists. Duplicate ignored.");
        }

        // 4. Displaying the final Set
        System.out.println("\n--- Final Unique Bogie Inventory ---");
        System.out.println("Total Unique Bogies: " + bogieIds.size());
        System.out.println("Registered IDs: " + bogieIds);

        System.out.println("\nNote: Observe that the order might differ from the insertion order.");
        System.out.println("System ready for unique identification checks...");
    }
}
import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
        public static void main(String[] args) {

            // 1. Initialize the Train Consist
            List<String> trainConsist = new ArrayList<>();
            System.out.println("=== Initializing Train with Passenger Bogies ===\n");

            // 2. ADDING BOGIES (Create/Insert)
            trainConsist.add("Sleeper");
            trainConsist.add("AC Chair");
            trainConsist.add("First Class");

            System.out.println("After adding bogies: " + trainConsist);
            System.out.println("Total Bogies: " + trainConsist.size());
            System.out.println("------------------------------------------");

            // 3. REMOVING A BOGIE (Delete)
            // Removing "AC Chair" from the consist
            trainConsist.remove("AC Chair");
            System.out.println("Action: Removing 'AC Chair'...");
            System.out.println("Updated Train Consist: " + trainConsist);
            System.out.println("------------------------------------------");

            // 4. CHECKING EXISTENCE (Search)
            // Using contains() to check if a specific bogie is still attached
            boolean hasSleeper = trainConsist.contains("Sleeper");
            System.out.println("Checking: Is 'Sleeper' still in the consist? " + hasSleeper);

            // 5. FINAL STATE
            System.out.println("\nFinal Bogie Count : " + trainConsist.size());
            System.out.println("Final Train Consist : " + trainConsist);
            System.out.println("\nSystem ready for further operations...");
        }
    }


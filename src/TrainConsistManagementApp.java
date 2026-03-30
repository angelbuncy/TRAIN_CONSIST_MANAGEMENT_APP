import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
        public static void main(String[] args) {

            // 1. Display welcome banner
            System.out.println("==========================================");
            System.out.println(" === Train Consist Management App ===");
            System.out.println("==========================================\n");

            // 2. Create a dynamic List to store train bogies
            // Using List interface for abstraction and ArrayList for implementation
            List<String> trainConsist = new ArrayList<>();

            // 3. Display initial consist information
            System.out.println("Train initialized successfully...");

            // size() returns the number of elements currently in the list
            System.out.println("Initial Bogie Count : " + trainConsist.size());

            // Printing the list object directly shows its contents (currently empty [])
            System.out.println("Current Train Consist : " + trainConsist);

            System.out.println("\nSystem ready for operations...");
        }
    }


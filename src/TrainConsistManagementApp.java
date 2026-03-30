import java.util.LinkedList;

/**
 * UC4: Maintain Ordered Bogie IDs (LinkedList Operations)
 * This class simulates the physical chaining of a train.
 * It demonstrates efficient insertion at the head, tail, and middle.
 */
public class TrainConsistManagementApp{

    public static void main(String[] args) {

        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("=== Physical Train Consist Formation ===\n");

        // 2. Building the initial sequence
        trainConsist.add("Sleeper");
        trainConsist.add("AC Coach");
        trainConsist.add("Cargo");

        // Using addFirst and addLast for specific positioning
        trainConsist.addFirst("Engine");       // Engine must be at the front
        trainConsist.addLast("Guard Coach");   // Guard must be at the rear

        System.out.println("Initial Formation: " + trainConsist);

        // 3. Inserting in the middle (Pantry Car at position 2)
        // LinkedList handles this by simply updating the neighboring pointers
        System.out.println("\nAction: Inserting 'Pantry Car' at position 2...");
        trainConsist.add(2, "Pantry Car");
        System.out.println("Updated Formation: " + trainConsist);

        // 4. Detaching bogies (Removing First and Last)
        System.out.println("\nAction: Detaching the Engine and the Guard Coach...");
        trainConsist.removeFirst();
        trainConsist.removeLast();

        // 5. Final State
        System.out.println("\n--- Final Ordered Train Consist ---");
        System.out.println("Current Sequence: " + trainConsist);
        System.out.println("Total Bogies: " + trainConsist.size());

        System.out.println("\nSystem ready for coupling/de-coupling operations...");
    }
}
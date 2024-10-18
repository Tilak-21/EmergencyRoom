import java.util.Scanner;

public class EmergencyRoom {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // Scanner for user input
        priorityQueue emergencyRoom = new priorityQueue(10);  // Priority queue for patients

        while (true) {
            System.out.println("\n--- Emergency Room System ---");
            System.out.println("1. Admit a new patient");
            System.out.println("2. Treat the highest priority patient");
            System.out.println("3. View the highest priority patient");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();  // Read user choice
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Admit a new patient
                    System.out.print("Enter patient name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter patient priority (1-10): ");
                    int priority = scanner.nextInt();

                    // Admit the patient into the emergency room queue
                    emergencyRoom.admitPatient(name, priority);
                    break;

                case 2:
                    // Treat the highest priority patient
                    if (!emergencyRoom.isEmpty()) {
                        PatientNode treatedPatient = emergencyRoom.treatPatient();
                        System.out.println("Treated patient: " + treatedPatient);
                    } else {
                        System.out.println("No patients to treat!");
                    }
                    break;

                case 3:
                    // View the patient with the highest priority
                    if (!emergencyRoom.isEmpty()) {
                        System.out.println("Highest priority patient: " + emergencyRoom.peek());
                    } else {
                        System.out.println("No patients in the queue.");
                    }
                    break;

                case 4:
                    // Exit the simulation
                    System.out.println("Exiting the system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid option.");
            }
        }

//        priorityQueue emergency = new priorityQueue(10);
//
//        emergency.admitPatient("Alice", 5);   // arrivalTime = 0
//        emergency.admitPatient("Bob", 5);     // arrivalTime = 1
//        emergency.admitPatient("Charlie", 5); // arrivalTime = 2
//
//        emergency.treatPatient();  // Should treat Alice first
//        emergency.treatPatient();  // Should treat Bob second
//        emergency.treatPatient();  // Should treat Charlie third
    }
}

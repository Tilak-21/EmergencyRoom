import java.util.Scanner;

public class EmergencyRoom {

    public static void main(String[] args) {

        priorityQueue emergency = new priorityQueue(10);

        emergency.admitPatient("Alice", 5);   // arrivalTime = 0
        emergency.admitPatient("Bob", 5);     // arrivalTime = 1
        emergency.admitPatient("Charlie", 5); // arrivalTime = 2

        emergency.treatPatient();  // Should treat Alice first
        emergency.treatPatient();  // Should treat Bob second
        emergency.treatPatient();  // Should treat Charlie third
    }
}

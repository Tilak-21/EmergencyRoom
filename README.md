Priority Queue Practice Problem: Emergency Room Simulation Using Priority Queue
Problem Statement:

You are tasked with implementing an emergency room patient management system where patients are treated based on their condition's severity. Each patient has a priority level, where a higher value represents a more critical condition. In case of equal priority, the patient who arrived earlier should be treated first.

You need to implement an emergency room system that supports the following operations:

Admit a patient: Admit a patient to the emergency room with their name and priority (severity).
Treat highest priority patient: Treat (remove) the patient with the highest priority. If multiple patients have the same priority, treat the one who arrived first.
Get highest priority patient: Return the patient with the highest priority without removing them. If multiple patients have the same priority, return the one who arrived first.
Check if the emergency room is empty: Return true if no patients are in the emergency room; otherwise, return false.

Class Definition:

You will need to implement a class EmergencyRoom with the following methods:

class EmergencyRoom {

    // Admit a new patient to the ER
    public void admitPatient(String name, int priority);

    // Treat (remove) the highest priority patient
    public String treatPatient();

    // Get the highest priority patient without treating them
    public String getHighestPriorityPatient();

    // Check if the ER is empty
    public boolean isEmpty();
}

Constraints:
You can assume that no two patients will have the same name.
Priority levels range from 1 to 10, where 1 is the least critical and 10 is the most critical.
Implement the system efficiently using a priority queue backed by a heap.

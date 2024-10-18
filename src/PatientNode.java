public class PatientNode {
    String name;
    int priority;
    long arrivalTime;

    public PatientNode(String name, int priority, long arrivalTime) {
        this.name = name;
        this.priority = priority;
        this.arrivalTime = arrivalTime;
    }
    @Override
    public String toString() {
        return name + "(priority: " + priority + ")";
    }
}

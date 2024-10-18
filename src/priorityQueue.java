
public class priorityQueue {

    private PatientNode[] heap; //array to store heap elements
    private int size; //Current size of the heap
    private long counter; //Used to track order of patient arrival


    public priorityQueue(int capacity) {
        heap = new PatientNode[capacity];
        size = 0;
        counter = 0;
    }

    public void admitPatient(String name, int priority) {
        if(size == heap.length) {
            throw new IllegalStateException("Queue is full");
        }

        PatientNode newPatient = new PatientNode(name, priority, counter++);
        heap[size] = newPatient;
        size++;
        heapifyUp(size - 1);
        System.out.println("Patient "+ name + " admitted with priority " + priority);

    }

    public PatientNode treatPatient() {
        if(size == 0) {
            throw new IllegalStateException("There are no patients!");
        }
        PatientNode maxPatient = heap[0];
        heap[0] = heap[size-1];
        size--;
        heapifyDown(0);
        System.out.println("Treated patient: " + maxPatient.name);
        return maxPatient;
    }

    public PatientNode peek() {
        if(size == 0) {
            throw new IllegalStateException("There are no patients!");
        }
        return heap[0];
    }

    public boolean isEmpty() {
        return size==0;
    }
    public void heapifyDown(int index) {
        int leftChild = 2 * index + 1;
        int rightChild = 2* index +2;
        int largest = index;

        if((leftChild < size) && (comparePatients(heap[leftChild], heap[largest]) > 0)) {
            largest = leftChild;
        }

        if(rightChild < size && (comparePatients(heap[rightChild], heap[largest]) > 0)) {
            largest = rightChild;
        }

        if(largest != index) {
            swap(index,largest);
            heapifyDown(largest);
        }

    }

    public void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;

        while(index > 0 && comparePatients(heap[index],heap[parentIndex])>0) {
            swap(index,parentIndex);
            index = parentIndex;
            parentIndex = (index-1)/2;
        }
    }

    private int comparePatients(PatientNode one, PatientNode two) {
        if(one.priority != two.priority) {
            return one.priority - two.priority;
        }
        return Long.compare(two.arrivalTime, one.arrivalTime);
    }

    private void swap(int first, int second) {
        PatientNode temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }


}

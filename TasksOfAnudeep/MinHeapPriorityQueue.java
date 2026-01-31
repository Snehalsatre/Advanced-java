package TasksOfAnudeep;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class MinHeapPriorityQueue {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeapPriorityQueue(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

   
    public int size() {
        return size;
    }

    
    public void insert(int item) {
        if (size == capacity) {
          
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity *= 2;
        }
        
        heap[size] = item;
        size++;
        heapifyUp(size - 1);
    }

  
    public int deleteMin() {
        if (isEmpty()) throw new NoSuchElementException("Queue is empty");
        
        int min = heap[0];
      
        heap[0] = heap[size - 1];
        size--;
        heapifyDown(0);
        
        return min;
    }

    private void heapifyUp(int index) {
        int parentIndex = (index - 1) / 2;
        if (index > 0 && heap[index] < heap[parentIndex]) {
            swap(index, parentIndex);
            heapifyUp(parentIndex);
        }
    }

    private void heapifyDown(int index) {
        int smallest = index;
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;

        if (leftChild < size && heap[leftChild] < heap[smallest]) {
            smallest = leftChild;
        }
        if (rightChild < size && heap[rightChild] < heap[smallest]) {
            smallest = rightChild;
        }

        if (smallest != index) {
            swap(index, smallest);
            heapifyDown(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        MinHeapPriorityQueue pq = new MinHeapPriorityQueue(10);
        pq.insert(15);
        pq.insert(5);
        pq.insert(20);
        pq.insert(1);
        

        System.out.println("Smallest removed: " + pq.deleteMin()); 
        System.out.println("Next smallest: " + pq.deleteMin());    
    }
}
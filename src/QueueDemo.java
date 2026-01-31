import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // Peek at the top element (smallest)
        System.out.println("Head of queue: " + pq.peek()); // Output: 10

        // Remove elements one by one
        while (!pq.isEmpty()) {
            System.out.println("Processing: " + pq.poll());
        }

	}

}
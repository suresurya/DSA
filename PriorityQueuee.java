import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueuee {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.add(50);
        pq.add(20);
        pq.add(80);
        pq.add(10);

        System.out.println("Min Priority Queue: " + pq);

        System.out.println("Removed Element: " + pq.poll());

        System.out.println("After Removal: " + pq);
    }
}
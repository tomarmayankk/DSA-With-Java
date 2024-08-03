package Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
//Java program to perform operations in Priority Queue
public class priorityQueue {
    public static void main(String[] args){
        //Creating a priority Queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        //adding elements
        pq.add(10);
        pq.add(20);
        pq.add(17);
        pq.add(9);

        //printing the Queue
        System.out.println(pq);

        //to reverse the order we use Comparator.reverseOreder

        PriorityQueue<Integer> reversePQ = new PriorityQueue<>(Comparator.reverseOrder());
        reversePQ.add(10);
        reversePQ.add(20);
        reversePQ.add(17);
        reversePQ.add(9);

        // Printing the reverse ordered Queue
        System.out.println("PriorityQueue (reverse order): " + reversePQ);

        //peek the head of the Priority Queue
        System.out.println("peek "+ pq.peek());

        //poll
        pq.poll();
        System.out.println("after poll " + pq);
    }
}

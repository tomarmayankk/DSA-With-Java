package Queue;
import java.util.*;
public class Basic {
    public static void main (String[] args){
        Queue <Integer> queue = new LinkedList<>();
        //add operation to add items in the queue
        queue.add(10);
        queue.add(12);
        queue.add(11);
        queue.add(24);
        queue.add(22);
        //print the queue

        System.out.println(queue);
        //remove element from the queue
        queue.remove();
        System.out.println(queue);
        int head = queue.peek(); //to check the head of the queue
        System.out.println("the head of the queue is " + head);

        //to check the size of the queue
        System.out.println("Size of the queue is: " + queue.size());
    }
}

package Queue;
//java program to implement the double ended queue (supports insertion and deletions from both the ends, therefore it is faster than the LL)


import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args){
    Deque <Integer> deque = new ArrayDeque<>();

    deque.add(78);
    deque.addLast(89);
    deque.removeFirst();
    //etc for more operations
    }   
}

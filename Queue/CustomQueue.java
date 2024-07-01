package Queue;
/* Java program to implement the custom Queue
 * We will try to implement operations like 'enque', 'deque', 'peek', 'isempty'
 */

public class CustomQueue {
    private int[] QueueArray;
    private int capacity;
    private int count;
    private int front;
    private int rear;

    //cunstructor to initialize the queue
    public CustomQueue(int size){
        QueueArray = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
        count = 0;
    }

    //method to add elements to the queue
    public void enque(int value){
        if(isfull()){
            System.out.println("the queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        QueueArray[rear] = value;
        count++;
    }

    //method to remove the front element from the queue
    public int deque(){
        if(isEmpty()){
            System.out.println("the queue is empty, nothing to remove");
            return -1;
        }
        front = (front + 1) % capacity;
        count--;
        return QueueArray[front];
    }

    //method to peek the element
    public int peek(){
        if(isEmpty()){
            System.out.println("The queue is empty, nothing to show");
            return -1;
        }
        return QueueArray[front];
    }

    //method to get the size of the queue
    public int size(){
        return count;
    }

    //method to print the elements in the queue
    public void printQueue(){
        if (isEmpty()) {
            System.out.println("Queue is empty, nothing to show");
            return;
        }
        for(int i =0; i<count; i++){
            System.out.print(QueueArray[(front+i) % capacity] + " ");
        }
        System.out.println();
    }


    //check the queue is full or not
    public boolean isfull(){
        return  count == capacity;
    }

    //check the queue is empty or not
    public boolean isEmpty(){
        return count == 0;
    }

    public static void main(String[] args){
        CustomQueue queue = new CustomQueue(5);
        queue.enque(10);
        queue.enque(7);
        queue.enque(8);
        queue.enque(4);
        queue.enque(5);
        queue.printQueue();//print the element

        System.out.println("The element is: " + queue.peek());//peek the element
        System.out.println("The size of the list is: " + queue.size());

        queue.deque();//delete the element
        queue.deque();
        System.out.println("the queue after deletion is: ");
        queue.printQueue();
    }
}

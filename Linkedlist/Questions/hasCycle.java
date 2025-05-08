package Linkedlist.Questions;
//program to check that the given linkedList has cycle or not


//Start by creating a Node class
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class hasCycle {
    private Node head;

    public hasCycle(){
        this.head = null;
    }
    //method to insert at the end of the linkedList
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }current.next = newNode;
        }
    }

    //method to insert at beginning
    public void insertBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    //method to detect cycle in list (It uses two pointer approach slow pointer and fast pointer, if the fast pointer meets the slow one then list has cycle)
    public boolean checkCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast != null ) {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }return false;
    }
    public static void main(String[] args){
        hasCycle list = new hasCycle();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        
        // Creating a cycle manually: 4 → 2
        list.head.next.next.next.next = list.head.next;

        System.out.println("Cycle Detected: " + list.checkCycle());  // Output: true
    }
}

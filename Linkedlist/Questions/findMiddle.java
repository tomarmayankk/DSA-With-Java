package Linkedlist.Questions;
//java program to find the middle of the linked list using java
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class findMiddle {
    private Node head;

    public findMiddle(){
        this.head = null;
    }

    //insert at end
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

    //method to find middle of the list
    public void findMid(){
        if(head == null){
            System.out.println("the list is empty");
            return;
        }

        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle element of the list: " + slow.data);
    }
    public static void main(String[] args){
        findMiddle list = new findMiddle();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(37);
        list.insert(38);
        list.insert(30);
        list.insert(40);
        list.insert(50);
    
        list.findMid(); 
    }
}

package Linkedlist.Questions;
//java program to reverse a linked List

//General Implementation of linkedList class
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
public class Reverse {
    private Node head;

    public Reverse(){
        this.head = null;
    }
    //insert data to the end of the linkedList
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

    //method to reverse the list
    public void reverseList(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } head = prev;
    }

    //method to display the list
    public void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }System.out.println();
    }

    public static void main(String[] args){
    Reverse list = new Reverse();

    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);

    System.out.println("Original List:");
    list.display();

    list.reverseList();

    System.out.println("Reversed List:");
    list.display();
    }
}

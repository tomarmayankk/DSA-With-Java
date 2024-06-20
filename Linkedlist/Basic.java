package Linkedlist;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
//initalize a linked list class
public class Basic {
    private Node head;

    public Basic(){
        this.head = null;
    }
    //Method to insert at the end of the linkedList
    public void insert(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
    //method to insert at the begining 
    public void insertBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
    //program to display the linked list
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "->");
            current = current.next;
        }
    }


    public static void main(String[] args){
            Basic list = new Basic();
            list.insert(22);
            list.insert(24);
            list.insert(23);
            list.display();
    }
}
package Linkedlist;
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
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
            Node currrent = head;
            while(currrent.next != null){
                currrent = currrent.next;
            }
            currrent.next = newNode;
        }
    }
    
    public static void main(String[] args){

    }
}
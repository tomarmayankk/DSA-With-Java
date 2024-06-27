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
public class Basic { //this basic represents a linked list class
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
    //method to delete a node with specific data
    public boolean delete(int data){
        if(head == null){
            return false;
        }
        if(head.data == data){
            head = head.next;
            return true;
        }
        Node current = head;
        while(current.next != null){
            if(current.next.data == data){
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }
    //method to reverse a linked list
    public void reverse(){
        Node previous = null;
        Node current = head;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }
    public int search(int data){
        int count = 0;
        Node current = head;
        while (current!= null) {
            if(current.data == data){
                return count;
            }  
            current = current.next;
            count++;
        }
        return -1;
    }
    public static void main(String[] args){
            Basic list = new Basic();
            list.insert(22);
            list.insert(24);
            list.insert(23);
            list.insertBegin(33);
            System.out.println("list after adding the elements: ");
            list.display();
            list.delete(24);
            System.out.println("list after the deletion of the element: ");
            list.display();
            System.out.println("index of element" + list.search(22));
            list.reverse();
            System.out.println("list after reversal: ");
            list.display();
    }
}
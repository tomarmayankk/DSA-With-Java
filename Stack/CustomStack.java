package Stack;
/* the given java program will help to implement the custom stack
 * we will try to perform 'push' 'pop' 'peek' 'isfull' operations using our own stack
 */
public class CustomStack {
    private int[] stackArray;
    private int capacity;
    private int top;
    //constructor to initialize the stack array
    public CustomStack(int size){
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    //method to push an element 
    public void push(int value){
        if(isfull()){
            System.out.println("stack is full");
            return;
        }
        stackArray[++top] = value;
    }

    //method to pop the element from the array
    public int pop(){
        if(isEmpty()){
            System.out.println("unable to pop, the stack is empty");
            return -1;
        }
        return stackArray[top--];
    }

    //method to peek the element without removing it
    public int peek(){
        if(isEmpty()){
            System.out.println("uable to peek, the stack is empty");
            return -1;
        }
        return stackArray[top];
    }
    //method to get the size of the array
    public int getSize(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        return top + 1;
    }

    //method the check the stack is full
    public boolean isfull(){
        return top == capacity -1;
    }
    //method to check the stack is empty
    public boolean isEmpty(){
        return top == -1;
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println(); // New line after printing stack
    }
    public static void main(String[] args){
        CustomStack stack = new CustomStack(5);
        stack.push(5);
        stack.push(7);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.printStack();

        System.out.println(stack.peek());
        stack.pop();
        stack.printStack();

        System.out.println("Stack size after popping: " + stack.getSize());
    } 
}

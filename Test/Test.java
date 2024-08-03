package Test;

import java.util.Stack;
//reversing a stack
public class Test {
    public static void main(String[] args){
        Stack <Integer> stack1 = new Stack<>();
        stack1.push(34);
        stack1.push(36);
        stack1.push(38);
        System.out.println(stack1);

        Stack <Integer> stack2 = new Stack<>();
        stack2.push(stack1.pop());
        stack2.push(stack1.pop());
        stack2.push(stack1.pop());
        System.out.println(stack2);
    }
}

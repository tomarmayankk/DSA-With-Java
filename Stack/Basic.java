package Stack;
import java.util.Stack;

public class Basic {
    public static void main(String[] args){
        Stack <Integer> stack = new Stack<>();
        //push operation to push elements in the stack
        stack.push(34);
        stack.push(36);
        stack.push(38);
        System.out.println(stack);

        //pop operation to remove the element from the stack  
        stack.pop();
        stack.pop();
        System.out.println(stack);

    }
}


package Stack.Questions;

import java.util.Stack;

/* Question - Valid String Leetcode -20
 * Description - Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 */
public class validParenthesis {
    static boolean isValid(String s){
        if(s.length() == 0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(char i : s.toCharArray()){
            if(i == '{'){
                st.push('}');
            }
            else if(i == '('){
                st.push(')');
            }
            else if(i == '['){
                st.push(']');
            }
            else if (st.isEmpty() || st.pop() != i)
			return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s = "()[]{}";
        System.out.println(isValid(s));
    }
}

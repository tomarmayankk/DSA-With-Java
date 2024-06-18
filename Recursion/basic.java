package Recursion;
/* Recursion is an approach in programming where a function calls itself until the base condition is reached. It avoids the use of multiple loops in the program
 * lets begin with some basic Example
 */
public class basic {
    static int printNums(int n){
        if(n <= 1){
            return 1;
        }
       return n + printNums(n-1);
    }
    public static void main(String[] args){
        
        System.out.println(printNums(5));
    }
}


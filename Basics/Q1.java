package Basics;
//find that the number is even or odd?
public class Q1{
    public static boolean isOdd(int n){
        return (n & 1 ) == 1;
    }
    public static void main (String[] args) {
        int n = 5;
        System.out.println(isOdd(n));
    }
}

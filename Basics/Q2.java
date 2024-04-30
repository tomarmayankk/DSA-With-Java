package Basics;
//there is an array of number containg duplicate elements but there is a number with no duplicates find that number
public class Q2 {
    public static int FindUnique(int arr[]){
        int unique = 0;
        for(int n: arr){
            unique ^= n;
        }
        return unique;
   }
    public static void main(String[] args){
        int [] arr = {2, 3, 3, 4, 2, 6, 4};
        System.out.println(FindUnique(arr));
    }
    
}

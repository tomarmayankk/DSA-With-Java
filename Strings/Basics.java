package Strings;
//java program to understand about strings. this program contains multiple operations which will help you to understand more about the concept
public class Basics {
    public static void main(String[] args){
        //creating a string
        String str = "hello user";

        //accessing any character in string
        System.out.println(str.charAt(5));//just enter the index of the character

    //finding the first occurence of any character (you can also search for a string using the same method)
    char seachchar = 'o';
    int firstIndex = str.indexOf(seachchar);
    if(firstIndex != -1){
        System.out.println(firstIndex);
    }else{
        System.out.println("not found!");
    }
    //finding the last index
    int lastindex = str.lastIndexOf(seachchar);
    if(lastindex != -1){
        System.out.println(lastindex);
    }else{
        System.out.println("not found!");
    }
    //reverse a string using string builder
    StringBuilder sb = new StringBuilder(str);
    String reverse = sb.reverse().toString();
    System.out.println(reverse);

    System.out.println(reversal(str)); //function call for reversal function
    System.out.println(isPalindrome(str)); //function call for palindrome
    }
    //Manually reversing a string in java
    public static String reversal(String str){
        char [] chararray = str.toCharArray();
        int start = 0;
        int end = chararray.length -1;

        while (start < end) {
            char temp = chararray[start];
            chararray[start] = chararray[end];
            chararray[end] = temp;

            start++;
            end--;
        }
        return new String(chararray);
    }
    //checking the string is palindrome
    public static boolean isPalindrome(String str){
        int start = 0;
        int end = str.length()-1;

        while (start < end) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start ++;
            end--; 
        }
        return true;
    }
}

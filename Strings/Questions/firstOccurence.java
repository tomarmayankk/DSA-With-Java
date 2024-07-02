package Strings.Questions;
/* Question - Find the Index of the First Occurrence in a String Leetcode 28 (easy)
 * Description - Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * Intution - just use string.indexof
 */
public class firstOccurence {
    static int strStr(String haystack, String needle) {
        int firstIndex = haystack.indexOf(needle);
        if(firstIndex != -1){
            return firstIndex;
        }else{
            return -1;
        }
    }
    public static void main(String[] args){
        String haystack = "sadbutsad";
        String needle  = "sad";
        int result = strStr(haystack, needle);
        System.out.println(result);
        
    }
}

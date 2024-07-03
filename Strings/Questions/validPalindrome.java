package Strings.Questions;
/*Question - Valid Palindrome Leetcode 125 (easy)
 * Description - A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Intution - clean the blank space and capital letters and then check for isPalindrome using a function
 */
public class validPalindrome {
    static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = cleaned.length()-1;
        while(start < end){
            if(cleaned.charAt(start)!= cleaned.charAt(end)){
                return false;
            }
            start++;
            end--;
            }
            return true;
        } 
    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println(result);
    }
}

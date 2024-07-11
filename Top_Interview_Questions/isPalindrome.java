package Top_Interview_Questions;
//java program to check that the string is palindrome or not (We will check for valid palindrome)
public class isPalindrome {
    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        boolean result = Palindrome(str);
        System.out.println(result);
    }
    static boolean Palindrome(String str){
        String cleaned = str.replaceAll("[^a-zA-z0-9]", "").toLowerCase();
        int start = 0;
        int end = cleaned.length()-1;
        while (start<end) {
            if(cleaned.charAt(start) != cleaned.charAt(end)){
                return false;
            }   
            start++;
            end--;
        }
        return true;
    }
}

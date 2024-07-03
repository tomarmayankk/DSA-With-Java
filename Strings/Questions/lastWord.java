package Strings.Questions;
/* Question - Length of Last word Leetcode 58 (easy)
 * Description - Given a string s consisting of words and spaces, return the length of the last word in the string.
 * Intution - use a for loop from the end of the string and use if condition for the blank space
 */
public class lastWord {
    static int lengthOfLastWord(String s) {
        int count = 0;
        for(int i = s.length()-1; i >= 0; i--){
          if(s.charAt(i) != ' '){
            count++;
          }else if(count > 0) {
            break;
          } 
        }
        return count;
    }
    public static void main(String[] args){
        String s = "   fly me   to   the moon  ";
        int result = lengthOfLastWord(s);
        System.out.println(result);
    } 
}

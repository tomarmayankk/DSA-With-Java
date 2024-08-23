package Hashing.Questions;

import java.util.HashMap;
import java.util.Map;

/* Question - Ransome Note Leetocode - 383 (Easy)
 */
public class Ransom {
    static boolean canConstruct(String ransomNote, String magazine){
        Map<Character, Integer> magCount = new HashMap<>();

        for(char c: magazine.toCharArray()){
            magCount.put(c, magCount.getOrDefault(c, 0) +1);
        }

        for(char c: ransomNote.toCharArray()){
            if(!magCount.containsKey(c) || magCount.get(c) == 0){
            return false;
        }
        magCount.put(c, magCount.get(c) -1 );
    }
    return true;
    }
    public static void main(String[] args){
        // Test cases
        System.out.println(canConstruct("a", "b")); // false
        System.out.println(canConstruct("aa", "ab")); // false
        System.out.println(canConstruct("aa", "aab")); // true
    }
}

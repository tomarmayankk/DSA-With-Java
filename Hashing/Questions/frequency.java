package Hashing.Questions;
import java.util.HashMap;
import java.util.Map;

/* Source: PrepInsta 100 code
java program to print the frequency of each element in an array (The approach given below can be same for the string)
*/
public class frequency {
    public static void main(String[] args){
        int[] arr = {1, 2, 2, 3, 1, 1, 1, 4};
        printFrequency(arr);
    }
    static void printFrequency(int[] arr){
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        //adding the elements in the array
        for(int el: arr){
            freqMap.put(el, freqMap.getOrDefault(el , 0) + 1);
        }

        //printing the elements 
        for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()){
            System.out.println("Character: " + entry.getKey() + " " + "Frequency: " + entry.getValue());
        }
    }
}

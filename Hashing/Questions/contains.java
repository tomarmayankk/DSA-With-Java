package Hashing.Questions;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
//java program to check that the two elements contains the same elements or not, using hashset
public class contains {
    public static void main(String[] args){
        Integer[] a1 = {1,2,3,2,1};
		Integer[] a2 = {1,2,3};
		Integer[] a3 = {1,2,3,4};
		
		System.out.println(containsEl(a1, a2));
		System.out.println(containsEl(a1, a3));

    }
    static boolean containsEl(Integer[] arr1, Integer[] arr2){
        Set <Integer> set1 = new HashSet<>(Arrays.asList(arr1));
        Set <Integer> set2 = new HashSet<>(Arrays.asList(arr2));
        
        //for size mismatch it may return false because hashset does not contain duplicates
        if(set1.size() != set2.size()){
            return false;
        }
        for(Integer i: set1){
            if(!set2.contains(i)){
                return false;
            }
        }
        return true;
    }
}

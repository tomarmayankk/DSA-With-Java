package Hashing.Questions;

import java.util.Arrays;
import java.util.HashMap;
/*Leetcode - 1 (Easy)
 *finding the elements whose sum returns equal to the target using a hashmap 
*/

public class TwoSum {
    static int[] findEl(int[] arr, int target){
        HashMap<Integer, Integer> hp = new HashMap<>();

        for(int i = 0; i< arr.length; i++){
            int num = arr[i];
            if(hp.containsKey(target-num)){
                return new int[] {target - num, num}; //for returning the index -- new int[]{hp.getvalue(target- num, i)}
            }
            hp.put(num, i);
        }
        return new int[] {};
    }
    public static void main(String[] args){
        int [] nums = {2, 7, 11, 15};
        int target = 9;

        int [] result = findEl(nums, target);
        System.out.println(Arrays.toString(result));
    }
}

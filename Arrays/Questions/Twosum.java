package Arrays.Questions;
import java.util.Arrays;
/* Question - Twosum leetcode -1 (Easy)
 * description - given an array of integers (nums) and an integer (target) returns the sum of two numbers such that they add up to form the target
 * Intution - simply use bruteforce approch by applying two nested for loops and match the sum of indices with the target
 */
public class Twosum {
    public static void main(String[] args){
        int [] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
        public static int [] twoSum(int[] nums, int target){
            for(int i = 0; i< nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if (nums[i] + nums[j] == target){
                        return new int[] {i, j};
                    }
                }
            }
            return new int[] {}; //no solution found
        }
}

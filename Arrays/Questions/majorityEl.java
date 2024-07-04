package Arrays.Questions;
import java.util.Arrays;
/*Question - Majority Element Leetcode 169 (Easy)
 * Description - The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * Intution - sort the array, after sorting the majority element will automatically come in the middle of the array
 */
public class majorityEl {
    static int majorityElement(int[] nums){
        Arrays.sort(nums);
        int n = nums.length/2;
        return nums[n/2];
    }
    public static void main(String[] args){
        int [] nums = {3, 2, 3};
        int result = majorityElement(nums);
        System.out.println(result);
    }
}

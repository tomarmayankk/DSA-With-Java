package Arrays.Questions;
/* Question - Maximum subarray Leetcode - 53 (Medium)
 * Description - Find the subarray which returns the maximum sum
 * Intitution - simply use a current sum counter and intialize it with zero, now add the maximum sum to it by using a for loop
 */
public class MaxSubarr {
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 4, 5};
        int result = subArray(nums);
        System.out.println(result);

    }
    static int subArray(int[] nums){
        int maxSum =  Integer.MIN_VALUE;
        int currentSum = 0;
         for(int i=0; i<nums.length; i++){
            currentSum += nums[i];
            if(currentSum > maxSum){
                maxSum = currentSum;
            }
            if(currentSum < 0){
                currentSum = 0;
            }
         }
         
         return maxSum;
    }
}

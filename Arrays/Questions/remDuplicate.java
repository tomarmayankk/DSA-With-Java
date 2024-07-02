package Arrays.Questions;
/* Question - Remove Duplicates from the sorted array Leeetcode - 26 (Easy)
 * Description - Given an array of sorted order, remove the value repeted twice and return the size of the array containing the unique value
 * Intution - iterate over the array use i and j
 */
public class remDuplicate {
    static int remove(int [] nums){
        int j = 1;

        for(int i = 1; i < nums.length; i ++){
            if(nums[i] != nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 6, 3, 3, 5};
        int result = remove(nums);
        System.out.println(result);
    }
}

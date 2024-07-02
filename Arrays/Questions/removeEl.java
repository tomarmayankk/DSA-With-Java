package Arrays.Questions;
/* Question - Remove element Leetcode 27 (easy)
 * Description - in a given array of elements remove the occurence of an element VAL, you can change the order. return the size of array which does not contain the VAL
 * Intution - Iterate over the array, select the values which are not equal to val and put the new indices in the array
 */
public class removeEl {
     static int remove(int[] nums, int val){
        int j = 0;
        for (int i = 0; i< nums.length; i++){
            if( nums [i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String[] args){
        int[] nums = {1, 2, 3, 5};
        int val = 2;
        int result = remove(nums, val);
        System.out.println(result);

    }
}

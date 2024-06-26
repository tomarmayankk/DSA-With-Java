package Arrays.Questions;
/*Question - Search Insert Position Leetcode - 35 (Easy)
* Description -Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 You must write an algorithm with O(log n) runtime complexity.
 Intution - for the given time complexity the binary search algorithm will be the best approach
 */
public class InsertPosition {
    public static void main(String[] main){
        int [] arr = {1,3,5,6};
        int t = 4;
        int result = searchIndex(arr, t);
        System.out.println(result);

    }
    static int searchIndex(int[] arr, int t){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == t){
                return mid;
            }else if (arr[mid] < t){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}

package Searching_algo;
/* Java program to implement binary search
Binary search algorithm is approach which divides the array into half and then make comparisions, it only works on sorted array
time complexity - O(log n): this is far better than the linear search
 */
public class binary {
    static int Search(int arr[], int n){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == n){
                return mid;
            } else if(arr[mid] < n){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr [] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        int n = 31;
        int result = Search(arr, n);
        System.out.println(result);
    }
}

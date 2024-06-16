package Searching_algo;
/* linear search program
 linear search algorithm searches the item by iterating over the array using the for loop it checks and compare each and every element in the array
 Time complexity - O(n): as it iterates over n items
 */
public class linear {
    static int Search(int arr[], int n){
        int l = arr.length;
        //iterate over the loop for the item 
        for(int i = 0; i < l; i++){
            if(arr[i] == n){
                return i;
            }
        }
        return -1;
    }
    public static void main (String[] args){
        int arr [] = {1, 2, 3};
        int n = 3;
        int result = Search(arr, n);
        System.out.println(result);

    }
}

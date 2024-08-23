package Sorting_algo;
//java program to implement insertion sort
public class insertion {
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6};

        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        insertionSort(arr);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    //function to perform the insertion sort
    static void insertionSort(int[] arr){
        int n = arr.length;

        //starting from the second element as 1st is considerd as sorted
        for(int i = 0; i<n; i++){
            int key = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > key) {
                arr[j +1] = arr[j];
                j = j -1;
            }
            //place the key in its correct position
            arr[j + 1 ] = key;
        }
    }
}

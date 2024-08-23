package Sorting_algo;
//java program to implement selection sort algorithm
public class selection {
    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSort(arr);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void selectionSort(int[] arr){
        int n = arr.length;

        //move along the array
        for(int i = 0; i< n-1; i++){
            int minIndex = i;

            //check that the any index is smaller than the min index
            for(int j = i+1; j< n; j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

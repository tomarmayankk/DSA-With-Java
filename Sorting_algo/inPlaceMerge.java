package Sorting_algo;

import java.util.Arrays;

/* java program for the inplace mergesort
 * unlike the normal mergesort approach the inplace mergesort do not copy the array, means it prform the operation on the original array
 */
public class inPlaceMerge {
    public static void main(String[] args){
        int[] arr = { 1, 4, 5, 7, 8, 9};
        mergeInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    //function to sort the array
    static void mergeInPlace(int[] arr, int start, int end) {
        if(start - end <= 1){
            return;
        }
        int mid = (start + end)/ 2;
        mergeInPlace(arr, start, mid);
        mergeInPlace(arr, mid, end);

        combine(arr, start, mid, end);
    }
    //function to merge the array
    static void combine(int[] arr, int start, int mid, int end){
        int[] mix = new int[end - start];

        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i< mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l< mix.length; l++){
            arr[start + l] = mix[l];
        }
    }
}

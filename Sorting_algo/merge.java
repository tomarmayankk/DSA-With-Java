package Sorting_algo;

import java.util.Arrays;

//java program to represent merge sort Using recursive approach
public class merge {
    public static void main(String[] args){
        int[] arr = { 5, 3, 4, 2, 7};
        arr = mergeSort(arr);
       System.out.println(Arrays.toString(arr)); 
    }
    //function to divide the array recursively
    static int[] mergeSort(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return combine(left, right);
    }
    //function to merge
    public static int[] combine (int[] first, int[] second){
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i< first.length && j <second.length) {
            if(first[i] <= second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        //the condition if any array has more elements
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

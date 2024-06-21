package Arrays;
//java program to teach the basics of an array in java. An array is a contigious memory block which helps in storing elements at any given index
public class Basics {
    public static void main(String[] args){
        //initalizing an array
    int [] arr = {1, 2, 3, 4, 5};

    //print an array
    for(int i = 0; i<arr.length; i++){
        System.out.println(arr[i]);
    }
    //print the sum of all elements in an array
    float sum = 0;
    for(int i = 0; i<arr.length; i++){
        sum = sum + arr[i];
    }
    System.out.println(sum);
    //print the average of an array
    float average;
    average = sum / arr.length;
    System.out.println(average);
    //program to reverse an array
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
        
    }
    for(int i = 0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }   
    }
    
}

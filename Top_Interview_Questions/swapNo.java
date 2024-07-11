package Top_Interview_Questions;
import java.util.Arrays;
//java program to swap two numbers without using a third variable
public class swapNo {
    public static void main(String[] args){
        int a = 10;
	    int b = 20;
        String result = Arrays.toString(swap(a , b));
        System.out.println(result);

    }
    //subtract operations to swap
    static int[] swap(int a, int b){
        a = b + a;
        b = a - b;
        a = a - b;
        return new int[]{a , b};
    }
}

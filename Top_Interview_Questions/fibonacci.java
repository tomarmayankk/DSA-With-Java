package Top_Interview_Questions;
//java program to print the fibonacci series using recursion
public class fibonacci{
    public static void main(String[] args){
        int numTerms = 10;
        for(int i = 0; i< numTerms; i++){
            System.out.print(fibonacciSeries(i) + " ");
        }
    }

    //function to build fibonnaci series
    static int fibonacciSeries(int n){
        if(n <= 1){
            return n;
        }else{
            return fibonacciSeries(n-1) + fibonacciSeries(n-2);
        }
    }
}

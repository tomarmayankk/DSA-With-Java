package Top_Interview_Questions;
//Operations on numbers
public class number {
    public static void main(String[] args){
        int n = 49;
        System.out.println("is the number prime?: " + isPrime(n));
        System.out.println("factorial of "+ n +" is: "+ factorial(n));
    }
    //function to check the number is prime or not
    static boolean isPrime(int n){
        if(n==0 || n==1){
            return false;
        }if(n == 2) return true;
        
        for (int i = 2; i< n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }    
    //function to find the factorial of a number
    static long factorial(long n){
        if(n<=1){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }
}

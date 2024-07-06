package Basics.Interview;
/* Question - Pass the pillow  Leetcode - 2582 (Easy)
 * Description- There are n people standing in a line labeled from 1 to n. The first person in the line is holding a pillow initially. Every second, the person holding the pillow passes it to the next person standing in the line. Once the pillow reaches the end of the line, the direction changes, and people continue passing the pillow in the opposite direction.
 * For example, once the pillow reaches the nth person they pass it to the n - 1th person, then to the n - 2th person and so on.
 *  Given the two positive integers n and time, return the index of the person holding the pillow after time seconds.
 * Intution- Take two variables completed and remaining, completed will check the number of cycles, and remaining will check the number of var ramaining.
 */
public class Q1 {
    static int passThePillow(int n, int time){ //n is the number of people, time is the passing frequency
        int completed = time/(n-1);
        int remaining = time % (n-1);
        int ans;
        if(completed % 2 != 0){
            ans = n-remaining;
        } else {
            ans = remaining + 1;
        }
        return ans;

    }
    public static void main(String[] args){
        int n = 4;
        int time = 5;
        int result = passThePillow(n, time);
        System.out.println(result);
    }
}

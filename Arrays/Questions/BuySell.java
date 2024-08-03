package Arrays.Questions;
/* Question - Best time to buy and sell the stocks Leetcode - 121 (Easy)
 * Description - You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
Intution - 
 */
public class BuySell {
    static int maxProfit(int[] arr){
        int profit = 0;
        int buyPrice = arr[0];
        for(int i = 0; i< arr.length; i++){
            profit = Math.max(profit, arr[i]- buyPrice);
            buyPrice = Math.min(buyPrice, arr[i]);
        }
        return profit;
    }
    public static void main(String[] args){
        int [] arr = {7,1,5,3,6,4};
        int result = maxProfit(arr);
        System.out.println(result); 
    }
}
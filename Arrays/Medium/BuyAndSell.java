/*Best Time to Buy and Sell Stock
----You are given an array prices where prices[i] is the price of a given stock on the ith day.
----You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
----Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0
 */

public class BuyAndSell {

/*
    //Brute Force Approach - time Complexity:O(N^2)
    public static int maxProfit(int[] prices){
        int maxPro = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]>prices[i]){
                    maxPro = Math.max(prices[j]-prices[i],maxPro);
                }
            }
        }
        return maxPro;
    }
*/

    //Optimal Approach
    public static int maxProfit(int[] prices) {
        int maxPro = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            min = Math.min(min, prices[i]);
            maxPro = Math.max(maxPro, prices[i]-min);
        }
        return maxPro;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int profit = maxProfit(arr);
        System.out.println("The maximum profit to buy and sell stocks are: "+profit);
    }
}

/*
You are given a 0-indexed integer array candies. Each element in the array denotes a pile of candies of size candies[i]. You can divide each pile into any number of sub piles, but you cannot merge two piles together.

You are also given an integer k. You should allocate piles of candies to k children such that each child gets the same number of candies. Each child can be allocated candies from only one pile of candies and some piles of candies may go unused.

Return the maximum number of candies each child can get.

Input: candies = [5,8,6], k = 3
Output: 5
 */

public class MaxCandies {
    //Brute Force
    public static int maximumCandies(int[] candies, long k) {
        long totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }
        if (totalCandies < k) {
            return 0; // Not enough candies for each child to get at least one
        }
        long left = 1, right = totalCandies;
        int res = 0;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long count = 0;

            for (int candy : candies) {
                count += candy / mid;
            }
            if (count >= k) { 
                res = (int) mid;
                left = mid + 1;  
            } else {
                right = mid - 1; 
            }
        }
         return res;
    }
    public static void main(String[] args) {
        int c[] = {5,8,6};
        int k = 3;
        int result = maximumCandies(c, k);
        System.out.println(result);
    }
}

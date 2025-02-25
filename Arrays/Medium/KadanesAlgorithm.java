/*
----Kadane's Algorithm : Maximum Subarray Sum in an Array
----Problem Statement: Given an integer array arr, find the contiguous subarray (containing at least one number) which
has the largest sum and returns its sum and prints the subarray.
----Example 1:
Input:arr = [-2,1,-3,4,-1,2,1,-5,4] 
Output:6 
Explanation:[4,-1,2,1] has the largest sum = 6. 
 */

public class KadanesAlgorithm {

/* 
    //Brute Force Algorithm - Time Complexity:O(n^2)
    public static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                maxi=Math.max(maxi,sum);
            }
        }
        return maxi;
    }
*/
    
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = maxSubArray(arr);
        System.out.println("Sub Array with maximum sum is: "+maxSum);
    }
}

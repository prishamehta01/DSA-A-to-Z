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


//Optimal 
    public static int kadane(int[] nums){
        int gmax = nums[0];
        int cmax = nums[0];
        for(int i=1;i<nums.length;i++){
            cmax = Math.max(nums[i],cmax+nums[i]);
            gmax = Math.max(gmax,cmax);
        }
        return gmax;
    }
//Optimal Approach : The intuition of the algorithm is not to consider the subarray as a part of the answer if its sum is less than 0. A subarray with a sum less than 0 will always reduce our answer and so this type of subarray cannot be a part of the subarray with maximum sum.
//Time Complexity: O(N)
    
    /*public static int maxSubArray(int[] nums) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    */
    
    //Follow up Question - if we need to print the sub array too...
    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int start = 0;
        int startAns = -1, endAns = -1;
        for(int i=0;i<nums.length;i++){
            if(sum==0)
                start = i;
            sum+=nums[i];
            if(sum>maxi){
                maxi=sum;
                startAns = start;
                endAns = i;
            }
            if(sum<0){
                sum = 0;
            }
        }

        System.out.print("The SubArray with Largest sum is :[");
        for(int i=startAns;i<=endAns;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("]\n");
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = {5,-8,1,2,-1,4};
        int maxSum = maxSubArray(arr);
        System.out.println("Sub Array with maximum sum is: "+maxSum);
        int kadane = kadane(arr);
        System.out.println(kadane);
    }
}

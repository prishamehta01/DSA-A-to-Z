//An integer array nums (can have both positive and negative numbers).We want to find the maximum absolute sum of any subarray.

public class MaxAbsSum {
    
/* 
//Brute Force - Time Complexity : O(N^2)
    public static int maxAbsoluteSum(int[] nums) {
        int maxi = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                maxi=Math.max(maxi,Math.abs(sum));
            }
        }
        return maxi;
    }
*/

//Optimal Approach - Time Complexity:O(n)
    public static int maxAbsoluteSum(int[] nums) {
        int sum = 0, minSum = 0, maxSum = 0;
        for (int num : nums) {
            sum += num;
            if (sum > maxSum) maxSum = sum;
            if (sum < minSum) minSum = sum;
        }
        return Math.abs(maxSum - minSum);
    }

    public static void main(String[] args) {
        int[] arr = {2,-5,1,-4,3,-2};
        int result = maxAbsoluteSum(arr);
        System.out.println("Maximum Absolute sum of any subarray is: "+result);
    }
}

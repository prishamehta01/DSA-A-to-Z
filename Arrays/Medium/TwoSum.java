/*
Two Sum Problem - Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*/

import java.util.*;

class TwoSum{
    
/* //Brute Force Approach - Time Complexity : O(n^2)
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]+nums[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


    //Better Approach - Hashing -Time Complexity:O(N) - Space complexity:O(N)
    //We have optimized this problem enough. But if in the interview, we are not allowed to use the map data structure, then we should move on to the next approach below i.e. two pointer approach. This approach will have the same time complexity as the better approach.
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        res[0]=res[1]=-1;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num = nums[i];
            int moreNeeded = target - num;
            if(mp.containsKey(moreNeeded)){
                res[0] = mp.get(moreNeeded);
                res[1] = i;
                return res;
            }
            mp.put(nums[i],i);
        }
        return res;
    }

    //Optimal if just returning where target is found or not
    public static String twoSum(int n, int []arr, int target) {
        Arrays.sort(arr);
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return "YES";
            } else if (sum < target) left++;
            else right--;
        }
        return "NO";
    }

*/
    //Optimal Approach - Two Pointer - Time Complexity : O(N) + O(N*logN)
    //In this approach, we will first sort the array and will try to choose the numbers in a greedy way.
    public int[] twoSum(int[] nums, int target){
        int[][] pairs = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            pairs[i][0] = nums[i];  // value
            pairs[i][1] = i;        // original index
        }
        
        // Sort based on values
        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);
        
        // Two pointer approach
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = pairs[left][0] + pairs[right][0];
            if (sum == target) {
                return new int[]{pairs[left][1], pairs[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{};
}
    
    public static void main(String[] args){
        TwoSum obj = new TwoSum();
        int[] arr = {2,7,11,2};
        int target = 4;
        int[] res =  obj.twoSum(arr,target);
        for(int a:res){
            System.out.print(a+" ");
        }
    }
}
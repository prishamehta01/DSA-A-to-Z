/*
Two Sum Problem - Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*/

import java.util.HashMap;

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
*/
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

    public static void main(String[] args){
        TwoSum obj = new TwoSum();
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] res =  obj.twoSum(arr,target);
        for(int a:res){
            System.out.print(a+" ");
        }
    }
}
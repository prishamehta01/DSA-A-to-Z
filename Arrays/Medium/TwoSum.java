/*
Two Sum Problem - Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
*/

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
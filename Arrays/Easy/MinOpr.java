/*You are given an integer array nums. You need to ensure that the elements in the array are distinct. To achieve this, you can perform the following operation any number of times:

Remove 3 elements from the beginning of the array. If the array has fewer than 3 elements, remove all remaining elements.
Note that an empty array is considered to have distinct elements. Return the minimum number of operations needed to make the elements in the array distinct.

  */

//Optimal -- O(N)
public class MinOpr {
    public static int minimumOperations(int[] nums) {
        boolean[] present = new boolean[128];
        for(int i=nums.length-1;i>=0;i--){
            if(present[nums[i]]){
                return i/3+1;
            }
            present[nums[i]] = true;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,2,3,3,5,7};
        int res = minimumOperations(a);
        System.out.println(res);
    }
}


/*
Variety 2:
You are given an integer array nums and an integer k.

An integer h is called valid if all values in the array that are strictly greater than h are identical.

For example, if nums = [10, 8, 10, 8], a valid integer is h = 9 because all nums[i] > 9 are equal to 10, but 5 is not a valid integer.

You are allowed to perform the following operation on nums:

Select an integer h that is valid for the current values in nums.
For each index i where nums[i] > h, set nums[i] to h.
Return the minimum number of operations required to make every element in nums equal to k. If it is impossible to make all elements equal to k, return -1.




class Solution {
    public int minOperations(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for(int n:nums){
            if(n<k){
                return -1;
            }
            else if(n>k){
                s.add(n);
            }
        }
        return s.size();
    }
}
 */
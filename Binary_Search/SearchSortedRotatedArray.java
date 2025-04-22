/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 
 */

public class SearchSortedRotatedArray {
    public static int search(int[] nums, int target) {
        int beg = 0,end = nums.length-1;
        int res = -1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]==target){
                res = mid;
            }
            if(nums[beg]<=nums[mid]){
                if(nums[beg]<=target && target<nums[mid]){
                    end = mid-1;
                }
                else{
                    beg = mid+1;
                }
            }
            else{
                if(target>nums[mid] && target<=nums[end]){
                    beg = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            
        }
        return res;
    }
    public static void main(String[] args) {
        int[] a = {4,5,6,7,0,1,2};
        int target = 0;
        int index = search(a, target);
        System.out.println(index);
    }
}

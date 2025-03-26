/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
 */

import java.util.Arrays;

/* Method 2
public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int longest = 1;
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    x = x+1;
                    cnt = cnt+1;
                }
                longest = Math.max(longest,cnt);
            }

        }
        return longest;
    }
 */

 //Time complexity - O(n)+O(nlogn)
public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;

        Arrays.sort(nums);
        int lastSmaller = Integer.MIN_VALUE;
        int longest = 1;
        int count = 0;

        for(int i=0;i<n;i++){
            if(nums[i]-1 == lastSmaller){
                count+=1;
                lastSmaller = nums[i];
            }
            else if (nums[i]!=lastSmaller){
                count = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest,count);

        }
        return longest;
    }
    public static void main(String[] args) {
        int[] a = {100,4,200,1,3,2};
        int res = longestConsecutive(a);
        System.out.println(res);
    }
}

/*
An element x of an integer array arr of length m is dominant if more than half the elements of arr have a value of x.
You are given a 0-indexed integer array nums of length n with one dominant element.
You can split nums at an index i into two arrays nums[0, ..., i] and nums[i + 1, ..., n - 1], but the split is only valid if: 0 <= i < n - 1  , nums[0, ..., i], and nums[i + 1, ..., n - 1] have the same dominant element.
Here, nums[i, ..., j] denotes the subarray of nums starting at index i and ending at index j, both ends being inclusive. Particularly, if j < i then nums[i, ..., j] denotes an empty subarray.

Return the minimum index of a valid split. If no valid split exists, return -1.
 */

import java.util.ArrayList;
import java.util.List;

class ValidSplit {
    //Time Complexity:O(n)
    public static int minimumIndex(List<Integer> nums) {
        // Step 1: Find the dominant element using Boyer-Moore Voting Algorithm
        int cnt = 0;
        int c = nums.get(0);
        for (int n : nums) {
            if (n == c) {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt == 0) {
                c = n;
                cnt = 1;
            }
        }
        int dominating_num = c;

        // Step 2: Count total occurrences of the dominant element
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == dominating_num) {
                count++;
            }
        }

        // Step 3: Find the smallest valid split index
        int prefixCnt = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == dominating_num) {
                prefixCnt++;
            }
            // Check if both left and right subarrays have the dominant element as the majority
            if (prefixCnt * 2 > (i + 1) && (count - prefixCnt) * 2 > (nums.size() - i - 1)) {
                return i; // Return the minimum index where a valid split exists
            }
        }
        return -1; // Return -1 if no valid split is found
    }
    public static void main(String[] args) {
        int[] nums = {2,1,3,1,1,1,7,1,2,1};
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : nums) {
            al.add(num);
        }
        int res = minimumIndex(al);
        System.out.println(res);
    }
}

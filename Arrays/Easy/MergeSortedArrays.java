/*
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
 */

import java.util.Arrays;

public class MergeSortedArrays {
    //Brute Force
    /*public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        }
        if(m==0){
            for(int i=0;i<n;i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        for(int i=0;i<n;i++){
            nums1[m+i]=nums2[i];
        }
        Arrays.sort(nums1);
    }*/
    //Optimal Approach
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int last = m+n-1;
        m--;
        n--;
        while(m>=0 && n>=0){
            if(nums1[m]<nums2[n]){
                nums1[last] = nums2[n];
                n--;
            }
            else{
                nums1[last] = nums1[m];
                m--;
            }
            last--;
        }
        while(n>=0){
            nums1[last] = nums2[n];
            n--;
            last--;
        }
    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int[] a1 = {1,2,3,0,0,0};
        int[] a2 = {2,5,6};
        merge(a1, m, a2, n);
        for(int x:a1){
            System.out.print(x+" ");
        }
    }
}

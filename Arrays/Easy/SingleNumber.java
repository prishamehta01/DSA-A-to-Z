/* Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space. 

Approach: We can use the xor properties,i.e, 
XOR of two same numbers is always 0 i.e. a ^ a = 0 ←-- Property 1.
XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a  ←-- Property 2.
Therefore, we will be left with the single number.

Time Complexity: O(N), Space Complexity: O(1) */

import java.util.*;
public class SingleNumber{
    //Optimal Approach
    public static int findSingleNumber(int[] nums) {
        int singleNum=0;
        for(int x:nums){
            singleNum = singleNum^x;
        }
        return singleNum;
    }
    public static void main(String[] args){
        int[] a = {4,1,2,2,1};
        int num = findSingleNumber(a);
        System.out.println("The single number is: "+num);
    }
}
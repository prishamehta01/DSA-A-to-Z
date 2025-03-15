/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Input: height = [4,2,0,3,2,5]
Output: 9
 */

public class TrappingRainWater{

    //Optimal Approach - Two Pointers
     public static int trap(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n-1;
        int leftMax = height[left];
        int rightMax = height[right];
        int water = 0;
        while(left<right){
            if(leftMax<rightMax){
                left++;
                leftMax = Math.max(leftMax,height[left]);
                water+= leftMax-height[left];
            }
            else{
                right--;
                rightMax = Math.max(rightMax,height[right]);
                water+= rightMax - height[right];
            }
        }
        return water;
    }
    public static void main(String[] args){
        int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int res = trap(height);
        System.out.println(res);
    }
}
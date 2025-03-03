/*
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
You should return the array of nums such that the the array follows the given conditions:
---Every consecutive pair of integers have opposite signs.
---For all integers with the same sign, the order in which they were present in nums is preserved.
---The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions. */



public class RearrangeEle {

    /*
    //Brute Force Method - Time Complexity:O(N+N/2) - Space Complexity:  O(N/2 + N/2) = O(N) 
    public static int[] rearrangeArray(int[] nums){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) pos.add(nums[i]);
            else neg.add(nums[i]);
        }
        for(int i=0;i<nums.length/2;i++){
            nums[2*i]=pos.get(i);
            nums[(2*i)+1] = neg.get(i);
        }
        return nums;
    }
    */

    //Optimal Approach - Time Complexity:O(N) - Space Complexity :O(n)
    public static int[] rearrangeArray(int[] nums) {
        int posIndex = 0, negIndex = 1;
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                res[posIndex]=nums[i];
                posIndex+=2;
            }
            else{
                res[negIndex]=nums[i];
                negIndex+=2;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        arr = rearrangeArray(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}

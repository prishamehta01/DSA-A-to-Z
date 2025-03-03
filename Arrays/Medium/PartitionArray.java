/*You are given a 0-indexed integer array nums and an integer pivot. Rearrange nums such that the following conditions are satisfied:
---Every element less than pivot appears before every element greater than pivot.
---Every element equal to pivot appears in between the elements less than and greater than pivot.
---The relative order of the elements less than pivot and the elements greater than pivot is maintained.
More formally, consider every pi, pj where pi is the new position of the ith element and pj is the new position of the jth element. If i < j and both elements are smaller (or larger) than pivot, then pi < pj.
Return nums after the rearrangement. */

public class PartitionArray {
    //Time Complexity:O(n) + O(n) + O(n) = 3O(n) ~ O(n)
    public static int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];
        int index = 0;
        for(int x:nums){
            if(x<pivot) res[index++]=x;
        }
        for(int y:nums){
            if(y==pivot) res[index++] = y;
        }
        for(int z:nums){
            if(z>pivot) res[index++] = z;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {9,12,5,10,14,3,10};
        arr = pivotArray(arr, 10);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}

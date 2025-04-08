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

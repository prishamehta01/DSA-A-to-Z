/*
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and using only constant extra space. 
*/


//Brute force -- binary search
/*
public int findDuplicate(int[] nums) {
    int low = 1, high = nums.length - 1;
    while (low < high) {
        int mid = low + (high - low) / 2;
        int count = 0;

        for (int num : nums) {
            if (num <= mid) count++;
        }

        if (count > mid) {
            high = mid; // Duplicate is in [low, mid]
        } else {
            low = mid + 1; // Duplicate is in [mid+1, high]
        }
    }
    return low;
}


 */
//FLOYDS TORTOISE AND HARE
public class FindDuplicate {
    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);

        fast = nums[0];
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] a = {1,4,3,2,2};
        int dupli = findDuplicate(a);
        System.out.println(dupli);
    }
}

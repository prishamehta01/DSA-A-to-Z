/*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function(Arrays.sort()).
*/
public class SortColors {

/* 
//Brute force Method - Time complexity:O(N) it has many loop sand is redundant
    public static void sortColors(int[] nums) {
        int c0=0,c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                c0++;
            else if(nums[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        int j=0;
        while(c0!=0){
            nums[j++]=0;
            c0--;
        }
        while(c1!=0){
            nums[j++]=1;
            c1--;
        }
        while(c2!=0){
            nums[j++]=2;
            c2--;
        }
    }
*/
//Optimal Approach - This problem is a variation of the popular Dutch National flag algorithm. 
//Time Complexity : O(N)
    public static void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColors(arr);
        System.out.println("The sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

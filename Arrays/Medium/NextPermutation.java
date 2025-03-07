public class NextPermutation {
    public void rev(int[] nums,int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left]= nums[right];
            nums[right]= temp;
            left++;
            right--;
        }
    }
    //Optimal Approach - Time Complexity :O(n)
    public void nextPermutation(int[] nums) {
        int index = -1;
        for(int i=nums.length-2;i>=0;i--){  //finding break point
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index==-1){  //if no break point array is descending order,i.e last, so reverse the array to get 1st ele
            rev(nums,0,nums.length-1);
            return;
        }
        for(int i=nums.length-1;i>index;i--){  //finding a number greater than nums[index] but closer
            if(nums[i]>nums[index]){
                int temp = nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
                break;
            }
        }
        rev(nums,index+1,nums.length-1); //reverse the remaining elements to make it just the next permutation
    }
    public static void main(String[] args) {
        NextPermutation np = new NextPermutation();
        int[] arr = {1,2,3};
        np.nextPermutation(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

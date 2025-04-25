public class BinarySearch {
    public static int search(int[] nums, int target) {
        int beg = 0,end = nums.length-1;
        while(beg<=end){
            int mid = (beg+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                beg = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int index = search(arr, 9);
        System.out.println(index);
    }
}

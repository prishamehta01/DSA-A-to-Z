public class MissingNum {
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int s = 0;
        int e = n-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] != mid+1){
                if(mid==0 || nums[mid-1]==mid){
                    return mid+1;
                }
                e = mid-1;
            }
            else{
                s = mid + 1;
            }
        }
        return n+1;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,7,8,9,10};
        int res = missingNumber(a);
        System.out.println(res);
    }
}

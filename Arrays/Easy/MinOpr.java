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

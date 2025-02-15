//Approach -  We maintain a variable cnt that keeps a track of the number of consecutive 1’s while traversing the array. The other variable max_count maintains the maximum number of 1’s.
//Time Complexity: O(N)[single pass] , Space Complexity: O(1)[No extra memory used]
import java.util.*;
public class MaxConsecutiveOnes{
    public static int findMaxConsecutiveOnes(int[] nums){
        int cnt=0,max_cnt=0;
        for(int x:nums){
            if(x==1){
                cnt++;
            }
            else{
                cnt=0;
            }
            max_cnt=Math.max(max_cnt,cnt);
        }
        return max_cnt;
    }
    public static void main(String[] args){
        int[] a = {1,1,1,0,1,1};
        int max = findMaxConsecutiveOnes(a);
        System.out.println("The maximum  consecutive 1's are " + max);
    }
}

import java.util.Scanner;
import java.util.Arrays;
public class RemoveDuplicates{
    //Brute Force Approach - sort only 1st k elements to not loose unique elements--O(n*log(n))+O(n)
    /*public int removeDuplicates(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int k = set.size();
        int i=0;
        for(int x:set){
            nums[i++]=x;
        }
        Arrays.sort(nums,0,k);
        return k;
    }*/

   //Optimal Approach - Two Pointers - O(N)
   public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        for(int j=1;j<n;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int result = removeDuplicates(a);
        System.out.println(result);
    }
}
import java.util.*;
public class MoveZeroesToEnd{

    //Brute Force Approach- putting non-zero elements into temp array and then inserting zeroes at the end upto n. Time Complexity - O(2*N), Space Complexity - O(N)
    /*public static void moveZeroes(int[] nums){
        int n = nums.length;
        int j = 0;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp[j++] = nums[i];
            }
        }
        while(j<n){
            temp[j++]=0;
        }
        
        for(int i = 0;i<n;i++){
            nums[i] = temp[i];
        }
    }*/

    //Optimal Approach - j keeps track of 0s and i keeps track of non zero elements
    public static void moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        System.out.println("Array after moving zeroes: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
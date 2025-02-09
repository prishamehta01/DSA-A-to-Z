/*    Method - 1
To rotate an array by k places towards the right - the logic applied in method 1 is using another array temp to shift places using temp[(i+k)%n]=arr[i] and then putting back to arr,
but here the time complexity: O(N) and Space complexity : O(N)- extra memory used for temp array(not in-place)*/
/*    Method - 2 (in-place) Space optimized method
Here the steps involved to Right rotate by k places are:
1) Reverse the entire array
2)Reverse 1st k elements
3)Reverse remaining n-k elements
Here, the time complexity: O(n) and space complexity: O(1)*/

import java.util.*;
public class RightRotateByK{
    // Method- 1
    /*
    public static void rightRotate(int[] arr , int k){
        int n = arr.length;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[(i+k)%n] = arr[i];
        }
        int j = 0;
        for(int x:temp){
            arr[j++] = x;
        }
    }
    */

   //Method - 2
   
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of places to be rotated: ");
        int k = sc.nextInt();
        rightRotate(arr,k);
        System.out.println("Array after right rotation by k places is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
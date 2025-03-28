/*    Method - 1 (in-place) Space optimized method
Here the steps involved to Right rotate by k places are:
1)Reverse 1st k elements
2)Reverse remaining n-k elements
3)Reverse the entire array
Here, the time complexity: O(n) and space complexity: O(1)*/

import java.util.*;
public class LeftRotateByK{
    // Method- 1
    public static void leftRotate(int[] arr , int k){
        int n = arr.length;
        k = k % n; //for k>n
        Reverse(arr,0,k-1);
        Reverse(arr,k,n-1);
        Reverse(arr,0,n-1);
    }
    private static void Reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

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
        leftRotate(arr,k);
        System.out.println("Array after left rotation by k places is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
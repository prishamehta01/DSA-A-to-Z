// Recursive Bubble Sort is a variation of the bubble sort algorithm that uses recursion to repeatedly traverse the array, comparing and swapping adjacent elements until the array is sorted.
// Time Complexity:
// Best Case (Already Sorted): O(n) (single pass with no swaps)
// Average Case: O(n^2)
// Worst Case: O(n^2)
// Space Complexity:O(n) (due to recursion stack)

import java.io.*;
import java.util.Scanner;
public class RecursiveBubble{
    public static void recursiveBubbleSort(int[] arr, int n){
        if(n==1 ){
            return;
        }
        for(int j = 0;j<n-1;j++){
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        recursiveBubbleSort(arr,n-1);
    }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        recursiveBubbleSort(a,n);
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
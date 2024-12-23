/*A divide-and-conquer algorithm that sorts an array by selecting a pivot and partitioning elements into subarrays smaller and larger than the pivot
Time complexity: Best and Average Case: O(nlogn) [Occurs when the pivot divides the array into nearly equal halves]
Worst Case: O(n^2) (e.g., when the array is already sorted or reverse-sorted)
Space Complexity:Best and Average Case: O(logn)[due to the recursion stack] and Worst Case: O(n)
In-place(sorts the array without requiring extra space)
Not stable(Equal elements may not retain their original order)*/

import java.util.Scanner;
import java.io.*;
public class QuickSort{
    public static int partition(int[] arr , int low, int high){
        int pivot=arr[low], i = low, j=high;
        while(i<j)
        {
            while(pivot>=arr[i] && i<high ){
                i++;
            }
            while(pivot<=arr[j] && j>low){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }
    public static void quickSort(int[] arr, int low, int high)
    {
        if(low<high){
            int k = partition(arr,low,high);
            quickSort(arr,low,k-1);
            quickSort(arr,k+1,high);
        }
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
        quickSort(a,0,n-1);
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
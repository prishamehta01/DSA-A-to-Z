// Merge Sort is a divide-and-conquer sorting algorithm. It works by recursively dividing the array into smaller subarrays, sorting them, and then merging the sorted subarrays back into a single sorted array.
// Time Complexity: Best,average and worst case : O(nlogn).
// The O(nlogn) complexity arises because:
// Splitting: The array is divided into two halves repeatedly, which takes O(logn) levels of recursion.
// Merging: At each level, all elements are merged, which takes O(n) time.
// Space Complexity: O(n) Due to the use of a temporary array(not in-place)
// Stable sorting algorithm (maintains the relative order of equal elements)

import java.util.Scanner;
import java.io.*;
public class MergeSort{
    public static void merge(int[] arr , int low,int mid, int high){
        int i=low,j=mid+1,k=0;
        int[] temp = new int[high - low + 1];
        while(i<=mid && j<=high){
            if(arr[i]<arr[j])
            {
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=high){
            temp[k++] = arr[j++];
        }
        for (int l = 0; l < temp.length; l++) {
            arr[low + l] = temp[l]; 
        }
    }
    public static void mergeSort(int[] arr , int low, int high){
        if(low>=high)
            return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
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
        mergeSort(a,0,n-1);
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
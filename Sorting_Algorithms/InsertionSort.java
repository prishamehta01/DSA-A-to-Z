// Insertion Sort is a simple sorting algorithm that builds the final sorted array one element at a time. It works by repeatedly picking the next element from the unsorted portion and placing it into its correct position in the sorted portion.
// Best case(Already sorted): O(N)
// Average(random order) and Worst case(reverse order): O(N^2)
// Space complexity: O(1) [In-place algorithm, no extra memory required]

import java.io.*;
import java.util.Scanner;
public class InsertionSort{
    public static void insertionSort(int[] arr,int n){
        for(int i=0;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j]=temp;
                    j--;
            }
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
        insertionSort(a,n);
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
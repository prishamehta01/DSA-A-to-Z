/*Recursive Insertion Sort is a sorting algorithm that sorts an array by recursively placing each element in its correct position relative to the already sorted part of the array.
Time complexity and space complexity remains same as recursive bubble sort.*/

import java.util.Scanner;
public class RecursiveInsertion{
    public static void recursiveInsertionSort(int[] arr,int i,int n)
    {
        if(i==n) 
            return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursiveInsertionSort(arr,i+1,n);
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
        recursiveInsertionSort(a,0,n);
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
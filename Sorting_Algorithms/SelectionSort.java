// Selection Sort is a simple comparison-based sorting algorithm that works by repeatedly finding the smallest (or largest, depending on the order) element from the unsorted part of the list and swapping it with the element at the current position in the sorted part.
// Time complexity: O(N^2)
// Space complexity:O(1) -- InPLace sorting

import java.util.Scanner;
public class SelectionSort{
    public static int[] selectionSort(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            int pos = i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[pos])
                {
                    pos=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }        
        a = selectionSort(a);
        System.out.print("Sorted Array: ");
        for(int num:a)
        {
            System.out.print(num+" ");
        } 
        sc.close();
        }
}

// Bubble Sort is a simple sorting algorithm that repeatedly compares and swaps adjacent elements in a list until the list is sorted. After each pass, the largest unsorted element "bubbles" to its correct position.
// Time Complexity: Best Case: O(n) (when the array is already sorted)
// Average and Worst Case: O(n²) (for unsorted or reverse order arrays)
// Space Complexity:
// Space Complexity: O(1) (since it sorts in place with a constant amount of extra space)


import java.util.Scanner;
public class BubbleSort{
    public static void bubbleSort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int didSwap = 0;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap = 1;
                }
            }
            if(didSwap==0){
                break;
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
        bubbleSort(a,n);
        System.out.println("Sorted Array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
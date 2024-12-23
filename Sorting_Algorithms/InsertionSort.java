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
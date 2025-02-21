//As we know for a array to sorted, each element should be less than the next element
//Single traversed - Optimal Approach - O(N) is the time complexity

import java.util.Scanner;
public class IfArraySorted{
    public static boolean isSorted(int[] arr,int n){
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) 
            { 
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean result = isSorted(a,n);
        System.out.println(result);
        sc.close();
    }
}
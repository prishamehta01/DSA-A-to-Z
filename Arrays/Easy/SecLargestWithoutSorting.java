/* The main goal here is to find the second Largest Element without Sorting.
Time complexity : O(N)
Space complexity : O(1) 
*/
//OPTIMAL APPROACH

import java.util.Scanner;
public class SecLargestWithoutSorting{
    public static int secMax(int[] arr){
        int n = arr.length;
        if(arr==null||n<2)
        {
            return -1;
        }
        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max){
                sec_max = max;
                max = arr[i];
            }
            else if(arr[i]>sec_max && arr[i]!=max){
                sec_max = arr[i];
            }
        }
        return (sec_max==Integer.MIN_VALUE)?-1:sec_max;
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
        int sec_large = secMax(a);
        System.out.println("The Second largest element is : "+ sec_large);
    }
}
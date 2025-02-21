/*This code checks if an array is sorted and rotated by counting how many times a decrease occurs when comparing each element to the next in a circular manner (arr[i] > arr[(i+1)%n]). If the count of decreases is ≤1, the array is considered sorted and rotated.
Time Complexity: O(N)
Space Complexity: O(1)
*/

import java.util.Scanner;
public class SortedAndRotated{
    public static boolean check(int[] arr, int n){
        int countDecreases = 0;
        if(n == 1){
            return true;
        }
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                countDecreases += 1;
            }
        }
        return countDecreases<=1;
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
        boolean result = check(a,n);
        System.out.println(result);
        sc.close();
    }
}
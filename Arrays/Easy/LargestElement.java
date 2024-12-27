//Using a max element to recursively find maximum element using a loop.
//Time Complexity: O(N)
//Space Complexity: O(1)
//Another method: Sort the array and then print arr[n-1](Brute force), Time Complexity: O(nlog(n))

import java.util.Scanner;
public class LargestElement{
    public static int maxEle(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
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
        int maximum = maxEle(a);
        System.out.println("The largest element is : "+ maximum);
    }
}
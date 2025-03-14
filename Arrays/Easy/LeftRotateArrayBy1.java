/*To rotate an array to the left by 1 , the logic used can be initially saving the 1st number into another variable temporarily and then rotating the array by 1 using for loop from 1 to n by arr[i-1]=arr[i], and then putting back the 1st value to the last(n-1th position)
Time Complexity = O(N)
Space Complexity = O(1)
*/

import java.util.Scanner;
public class LeftRotateArrayBy1{
    public static void leftRotate(int[] arr,int n){
        int a = arr[0];
        for(int i = 1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=a;
    }
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        leftRotate(arr,n);
        System.out.println("Array after left rotation is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
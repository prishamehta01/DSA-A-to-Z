
import java.util.*;
public class LongestSubArrK{
    
   /* 

    //Brute Force Method- Finding All possible SubArrays - time Complexity - O(n^2)
    public static int getLongestSub(int[] arr, int K){
        int n = arr.length;
        int len = 0 ;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                    sum+=arr[j];
                    if(sum==K){
                    len = Math.max(len,j-i+1);
                }
            }
        }
        return len;
    }
    
*/
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the sum K: ");
        int K = sc.nextInt();
        int LongestSubArrLen = getLongestSub(a,K);
        System.out.println("Length of largest Subarray with sum K is :"+LongestSubArrLen);
    }
}
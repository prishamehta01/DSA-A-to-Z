
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

    //Better Approach - Hashing - Time Complexity: O(n*logn) or O(n) ,space Complexity: O(n) 
    public static int getLongestSub(int[] arr, int k) {
        int n = arr.length;
        Map<Integer,Integer> mp = new HashMap<>();
        int maxlen=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen=Math.max(maxlen,i+1);
            }
            int rem = sum-k;
            if(mp.containsKey(rem)){
                int len = i-mp.get(rem);
                maxlen=Math.max(maxlen,len);
            }
            if(!mp.containsKey(sum)){
                mp.put(sum,i);
            }
        }
        return maxlen;
    }
*/
    //Optimal Approach - Two Pointers - Time Complexity:O(2*N) and Space Complexity:O(1)
    public static int getLongestSub(int[] arr, int k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
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
        System.out.println("Enter the sum K: ");
        int K = sc.nextInt();
        int LongestSubArrLen = getLongestSub(a,K);
        System.out.println("Length of largest Subarray with sum K is :"+LongestSubArrLen);
    }
}
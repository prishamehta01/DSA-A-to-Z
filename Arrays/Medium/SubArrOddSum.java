/*Given an array of integers arr, return the number of subarrays with an odd sum.
Since the answer can be very large, return it modulo 10^9 + 7. */

public class SubArrOddSum {
//BruteForce - Time Complexity : O(N^2)
/* 
    public int numOfSubarrays(int[] arr) {
        int count = 0;
        int MOD = 1000000007;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum % 2 != 0) {
                    count = (count + 1) % MOD;
                }
            }
        }
        return count;
    }
*/

//Optimal Approach - Time Complexity:O(N)
    public static int numOfSubarrays(int[] arr) {
        int count = 0,sum = 0,oddCount = 0,evenCount = 1;
        final int Mod = 1000000007; // It’s a magic number used in programming so the final count doesn’t get too big."Wrap it around"
        for(int x:arr){
            sum+=x;
            if((sum%2)!=0){
                count = (count+evenCount)%Mod; //odd+even=odd
                oddCount++;
            }
            else{
                count = (count+oddCount)%Mod; //even+odd=odd
                evenCount++;
            }
        }
        return (count%Mod);
    }

    
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int res = numOfSubarrays(a);
        System.out.println("The number of sub arrays with odd sum are: "+res);
    }
}

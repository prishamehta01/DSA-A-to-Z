/*
Here Method-1 is an optimal approach with: The approach here is finding sum of 1st n natural number and them subtracting it with the array sum which returns the missing element since array ranges from 0 to N numbers.
Time complexity - O(N) and space Complexity: O(1) 
*/
/*
Here Method-2 is also an optimal approach which uses properties of xor ,i.e, xor of same numbers is 0 , so it gives us the missing number by finding xor of numbers from 0 to n and xor of array elements.
Time complexity - O(N) and space Complexity: O(1) 
*/

import java.util.Scanner;
public class MissingNumber{
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = (n*(n+1))/2;
        int arraySum = 0;
        for(int x:nums){
            arraySum+=x;
        }
        int number = expectedSum - arraySum;
        return number;
    }

    /* Method 2
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xor1 = 0,xor2 = 0;
        for(int i=0;i<n;i++){
            xor1 = xor1 ^ i; //xor of [1...N-1] elements 
            xor2 = xor2 ^ nums[i]; //xor of array elements
        }
        xor1 = xor1 ^ n; //xor until [1..N]
        int number = xor1 ^ xor2;
        return number;
    }
    */

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements: ");
        int n = sc.nextInt(); //Ex: n = 9
        int[] a = new int[n];
        System.out.println("Enter the array elements from 0 to n with/without missingNumber: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt(); //Ex: 9,6,4,2,3,5,7,0,1
        }
        int missingNum = missingNumber(a);
        System.out.println("The missing number is : "+ missingNum); //8
    }
}
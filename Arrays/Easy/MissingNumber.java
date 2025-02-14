/*Here Method-1 is an optimal approach with: The approach here is finding sum of 1st n natural number and them subtracting it with the array sum which returns the missing element since array ranges from 0 to N numbers.
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
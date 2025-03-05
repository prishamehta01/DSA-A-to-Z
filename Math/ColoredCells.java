/*
There exists an infinitely large two-dimensional grid of uncolored unit cells. You are given a positive integer n, indicating that you must do the following routine for n minutes:
At the first minute, color any arbitrary unit cell blue.
Every minute thereafter, color blue every uncolored cell that touches a blue cell.

Example:
    Input: n = 2
    Output: 5
    Explanation: After 2 minutes, there are 4 colored cells on the boundary and 1 in the center, so we return 5.  */


import java.util.Scanner;
public class ColoredCells{
/* 
    //Better Approach - Intuition - Pattern(1,5,13....)
    public static long coloredCells(int n) {
        long res = 1;
        for(int i=0;i<n;i++){
            res+= (4*i);
        }
        return res;
    }
*/

    /*Optimal Approach - Time Complexity: O(1)
    - we know the pattern (1,5,13,25..) 
    can be written as 1+4(1+2+...+n-1) , sum of 1st n-1 natural numbers,
    which further is 1+(4(n*(n-1)/2))
    Simplified format = 1+2*(n)*(n-1)  */
    public static long coloredCells(int n) {
        return 1+(long)2*n*(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number minutes: ");
        n= sc.nextInt();
        long res = coloredCells(n);
        System.out.println("The number of colored cell at the end of "+n+" minutes is: "+res);
        sc.close();
    }
}
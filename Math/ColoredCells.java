import java.util.Scanner;
public class ColorCells{
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

    //Optimal Approach
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
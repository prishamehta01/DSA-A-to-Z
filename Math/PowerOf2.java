import java.util.Scanner;

public class PowerOf2{

    //Optimal Approach -- constraint:No bitwise operators allowed -- O(1)
    /*
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        double res = Math.log(n)/Math.log(2);
        return (res == (int)res);
    }
     */

    //Optimal Approach 2 -- O(logn)
    /*
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        while(n%2==0){
            n/=2;
        }
        return n==1;
    }
     */

    //Optimal Approach -- O(1)
    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if((n&(n-1))==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPowerOfTwo(n);
        System.out.println(res);
        sc.close();
    }
}
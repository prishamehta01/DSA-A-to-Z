public class Fibonacci {


    //Brute Force -- Recursion -- O(2^n)
    /*
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
     */


    
    //Optimal Appraoch --- O(N) ---Dynamic Programming Approach
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int[] fibSeries = new int[n];
        fibSeries[0] = 1;
        fibSeries[1] = 1;
        for(int i=2;i<n;i++){
            fibSeries[i]=fibSeries[i-1]+fibSeries[i-2];
        }
        return fibSeries[n-1];
    }
    public static void main(String[] args) {
        int num = fib(5);
        System.out.println(num);
    }
}

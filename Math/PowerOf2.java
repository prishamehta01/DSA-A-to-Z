import java.util.Scanner;

public class PowerOf2{

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
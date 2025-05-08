public class AddDigits {
    //Brute Force:
    /*public int addDigits(int num) {
        while(num>=10){
            int sum = 0;
            while(num!=0){
                sum+=(num%10);
                num/=10;
            }
            num = sum;
        }
        return num;
    }*/


    /* Optimal
    This uses the digital root concept from number theory:
    For base-10 numbers, the result of repeatedly summing digits is equivalent to num % 9, with special handling for zero.
     */
    public static int addDigits(int num) {
        if (num == 0) return 0;
        return 1 + (num - 1) % 9;
    }
    
    public static void main(String[] args){
        int num = 274;
        int res = addDigits(num);
        System.out.println(res);
    }
}

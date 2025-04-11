/*
You are given two positive integers low and high.

An integer x consisting of 2 * n digits is symmetric if the sum of the first n digits of x is equal to the sum of the last n digits of x. Numbers with an odd number of digits are never symmetric.

Return the number of symmetric integers in the range [low, high].

 
 */

public class CountSymm {
    public static int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for(int i = low;i<=high;i++)
        {
            if(i<100 && i%11==0){
                res++;
            }
            else if(i>=1000 && i<10000){
                int left = (i/1000)+((i%1000)/100);
                int right = ((i%100)/10)+i%10;
                if(left==right){
                    res++;
                }
            }
        }
       return res;
    }
    public static void main(String[] args) {
        int cnt = countSymmetricIntegers(1200, 1230);
        System.out.println(cnt);
        cnt = countSymmetricIntegers(1, 100);
        System.out.println(cnt);
        cnt = countSymmetricIntegers(1, 10);
        System.out.println(cnt);

    }
}

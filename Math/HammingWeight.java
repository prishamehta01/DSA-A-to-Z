public class HammingWeight {
    public static int hammingWeight(int n) {
        int cnt = 0;
        while(n!=0){
            int num = n&1;
            if(num == 1){
                cnt++;
            }
            n = n>> 1;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int num = 11;
        int res = hammingWeight(num);
        System.out.println(res);
    }
}

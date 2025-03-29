public class SquareRoot {
    static int sqrt(int n){
        int beg = 0;
        int end = n-1;
        int res = -1;
        while(beg<end){
            int mid = (beg+end)/2;
            if((mid*mid) == n){
                res = mid;
                return mid;
            }
            else{
                if((mid*mid) > n){
                    end = mid - 1;
                }
                else{
                    res = mid;
                    beg = mid+1;
                }
            }
        }
        return res;
        
    }
    public static void main(String[] args) {
        int res = sqrt(37);
        System.out.println(res);
    }
}

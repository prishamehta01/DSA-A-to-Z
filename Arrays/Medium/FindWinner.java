public class FindWinner {

    //Recusion -- beats 100%
    /*static int solve(int n,int k){
        if(n==1){
            return 0;
        }
        return (solve(n-1,k)+k)%n;
    }
    public static int findTheWinner(int n, int k) {
        int winner = solve(n,k)+1;
        return winner;
        
    }*/

    //More Optimised
    public static int findTheWinner(int n, int k) {
        int winner = 0;
        for(int i=2;i<=n;i++){
            winner = (winner+k)%i;
        }
        return winner+1;
    }
    public static void main(String[] args) {
        int res = findTheWinner(6,5);
        System.out.println(res);
    }
}

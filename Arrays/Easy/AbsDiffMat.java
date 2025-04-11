import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AbsDiffMat {
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int pri_diag = 0;
        int sec_diag = 0;
        for(int i=0;i<arr.size();i++){
            pri_diag+=arr.get(i).get(i);
            sec_diag+=arr.get(i).get(arr.size()-i-1);
        }
        int diff = Math.abs(pri_diag-sec_diag);
        return diff;
    }
    public static void main(String[] args) {
        List<List<Integer>> ls = new ArrayList<>();
        ls.add(Arrays.asList(11, 2, 4));
        ls.add(Arrays.asList(4, 5, 6));
        ls.add(Arrays.asList(10, 8, -12));
        int res = diagonalDifference(ls);
        System.out.println(res);
        
    }
}

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            row.add(1);
            for(int j = i-1;j>0;j--){
                row.set(j,row.get(j)+row.get(j-1));
            }
        }
        return row;
    }
    public static void main(String[] args) {
        int n = 3;
        List<Integer> res = getRow(n);
        System.out.println(res);

    }
}

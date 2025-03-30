public class MakeZeroes {

    //Brute force Method -- Time Complexity : O(m*n) , space complexity : O(m+n)
    public static void change(int[][] matrix,boolean[] row,boolean[] col){
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }
    public static void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        change(matrix,row,col);
    }
    public static void main(String[] args) {
        int[][] m = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int rows = m.length;
        int cols = m[0].length; 
        setZeroes(m);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}

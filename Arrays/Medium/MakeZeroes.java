public class MakeZeroes {

    //Better Method -- Time Complexity : O(m*n) , space complexity : O(m+n)
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

    /*
    Method 2
    public static void setZeroes(int[][] matrix) {
    int n = matrix.length, m = matrix[0].length;
        int col0 = 1;
        
        // Step 1: Mark the first row and column
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if (j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }
        
        // Step 2: Use markers to set elements to zero
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        // Step 3: Handle the first row
        if (matrix[0][0] == 0) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }
        
        // Step 4: Handle the first column
        if (col0 == 0) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }*/
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

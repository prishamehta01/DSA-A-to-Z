public class RotateArray {
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] rotated = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-i-1] = matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = rotated[i][j];
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{5,1,9,6},{2,4,8,1},{3,3,6,7},{5,1,2,6}};
        int n = 4;
        rotate(matrix);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}

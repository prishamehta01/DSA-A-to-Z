public class Search2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int e = (row*col)-1;
        int s = 0;
        int mid = s + (e-s)/2;
        while(s<=e){
            int ele = matrix[mid/col][mid%col];
            if(ele==target){
                return true;
            }
            else if(ele<target){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        Boolean res = searchMatrix(matrix, 3);
        System.out.println(res);
    }
}

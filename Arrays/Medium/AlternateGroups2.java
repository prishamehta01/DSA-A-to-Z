public class AlternateGroups2 {
    //Brute Force Approach
    /*public static int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        for(int i=0;i<n;i++){
            boolean isAlternating = true;
            for(int j=0;j<k-1;j++){
                if(colors[(i+j)%n]==colors[(i+j+1)%n]){
                    isAlternating = false;
                }
            }
            if(isAlternating) count++;
        }
        return count;
        
    }*/

    //Optimal Approach
    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;
        int count = 0;
        int left = 0;
        
        for (int right = 0; right < n + k - 1; right++) {
            if (right > 0 && colors[right % n] == colors[(right - 1) % n]) {
                left = right;  
            }
            
            if (right - left + 1 >= k) {
                count++;  
            }
        }
        
        return count;
    }
    public static void main(String[] args) {
        int[] colors = {0,1,0,0,1,0,1};
        int k = 6;
        int numberOfGroups = numberOfAlternatingGroups(colors,k);
        System.out.println("The number of Alternating groups are: "+numberOfGroups);
    }
}

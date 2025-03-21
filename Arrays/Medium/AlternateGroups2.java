/*
There is a circle of red and blue tiles. You are given an array of integers colors and an integer k. The color of tile i is represented by colors[i]:

colors[i] == 0 means that tile i is red.
colors[i] == 1 means that tile i is blue.

An alternating group is every k contiguous tiles in the circle with alternating colors (each tile in the group except the first and last one has a different color from its left and right tiles).

Return the number of alternating groups.

Note that since colors represents a circle, the first and the last tiles are considered to be next to each other.

 
 */



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

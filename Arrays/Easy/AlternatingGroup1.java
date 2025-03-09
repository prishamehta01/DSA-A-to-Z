/*There is a circle of red and blue tiles. You are given an array of integers colors. The color of tile i is represented by colors[i]:
colors[i] == 0 means that tile i is red.
colors[i] == 1 means that tile i is blue.
Every 3 contiguous tiles in the circle with alternating colors (the middle tile has a different color from its left and right tiles) is called an alternating group.
Return the number of alternating groups.
Note that since colors represents a circle, the first and the last tiles are considered to be next to each other. 

Example:
Input: colors = [1,1,1]
Output: 0*/


public class AlternatingGroup1 {
    //Optimal Approach - Simple iteration - fixed sliding window - Time complexity :O(n)
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        int n = colors.length;
        for(int i=0;i<n;i++){
            if(colors[(i)%n]!=colors[(i+1)%n] && colors[(i+1)%n]!=colors[(i+2)%n]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        AlternatingGroup1 a1 = new AlternatingGroup1();
        int[] colors = {0,1,0,0,1};
        int numberOfGroups = a1.numberOfAlternatingGroups(colors);
        System.out.println("The number of Alternating groups are: "+numberOfGroups);
    }
}

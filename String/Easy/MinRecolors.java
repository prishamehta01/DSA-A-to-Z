public class MinRecolors{

//Brute Force - Time Complexity:O(n^2)
/*  public static int minimumRecolors(String blocks, int k) {
        int minWhites = k;
        for(int i = 0; i <= blocks.length() - k; i++) { // Fix off-by-one error
            int whites = 0;
            for(int j = 0; j < k; j++) {
                if(blocks.charAt(i + j) == 'W') {
                    whites++;
                }
            }
            minWhites = Math.min(minWhites, whites);
        }
        return minWhites;
    }
*/

    //Better Approach - Time Complexity:O(n)
    public static int minimumRecolors(String blocks, int k) {
        int whites = 0;
        int minWhites = k;
        for(int i=0;i<k;i++){
            if(blocks.charAt(i)=='W'){
                whites++;
            }
        }
        minWhites = whites;
        for(int i=k;i<blocks.length();i++){
            if (blocks.charAt(i - k) == 'W') {
                whites--;
            }
            if (blocks.charAt(i) == 'W') {
                whites++;
            }
            minWhites = Math.min(minWhites,whites);
        }
        return minWhites;
    }
    public static void main(String[] args){
        String s = "WBBWWBBWBW";
        int k = 7;
        int minRecolors = minimumRecolors(s,k);
        System.out.println("The minimum number of recolors would be: "+minRecolors);
    }
}
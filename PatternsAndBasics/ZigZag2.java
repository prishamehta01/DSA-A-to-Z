public class ZigZag2 {
    public static void type1(String str){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=str.length();j++){
                if((i==1 && j%4==3) || (i==2 && j%2==0) || (i==3 && j%4==1)){
                    System.out.print(" "+str.charAt(j-1)+" ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String s = "abcabcabc";
        type1(s);
    }
}

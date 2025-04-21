public class ZigZag1 {

    public static void type1(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=13;j++){
                if((i==1 && j%4==3) || (i==2 && j%2==0) || (i==3 && j%4==1)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void type2(){
        for(int i=1;i<=3;i++){
            for(int j=1;j<=13;j++){
                if((i==1 && j%4==1) || (i==2 && j%2==0) || (i==3 && j%4==3)){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        type1();
        type2();
    }
}

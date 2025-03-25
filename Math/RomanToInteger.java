public class RomanToInteger {

    /*Brute force 
     public int romanToInt(String s) {
        HashMap<Character,Integer> hp = new HashMap<>();
        hp.put('I',1);
        hp.put('V',5);
        hp.put('X',10);
        hp.put('L',50);
        hp.put('C',100);
        hp.put('D',500);
        hp.put('M',1000);
        int res = 0;
        for(int i=0;i<s.length();i++){
            int val = hp.get(s.charAt(i));
            if(i<s.length()-1 && val < hp.get(s.charAt(i+1))){
                res-=val;
            }
            else{
                res+=val;
            }
        }
        return res;
    }
     */

     
    public static int romanToInt(String s) {
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        char[] symbols = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        
        int res = 0;
        int prevValue = 0;
        
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            int value = 0;
            for (int j = 0; j < symbols.length; j++) {
                if (symbols[j] == c) {
                    value = values[j];
                    break;
                }
            }
            if (value < prevValue) {
                res -= value;
            } else {
                res += value;
            }

            prevValue = value;
        }

        return res;
    }
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int res = romanToInt(s);
        System.out.println(res);
    }
}

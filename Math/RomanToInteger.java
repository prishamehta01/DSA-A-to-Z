public class RomanToInteger {
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

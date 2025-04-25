/*You are given a string s consisting of uppercase English letters ('A' to 'Z'). For each character in the string:
Convert the character to its ASCII value.
Find the perfect square number that is closest to this ASCII value.
If two square numbers are equally close, prefer the smaller one.
Convert the perfect square number into a character using its ASCII value.
Append this character to the result string.
Return the final transformed string.*/

//Example: ZOPSMART -> QQQQQ@QQ


public class NearestSquare {
    public static String Convert(String a) {
        StringBuilder result = new StringBuilder();

        for (char c : a.toCharArray()) {
            int ascii = (int) c;

            // Find the nearest perfect square
            int sqrt = (int) Math.round(Math.sqrt(ascii));
            int nearestSquare = sqrt * sqrt;

            // Convert that perfect square into ASCII char
            char converted = (char) nearestSquare;
            result.append(converted);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String input = "ZOPSMART";
        String output = Convert(input);
        System.out.println("Output: " + output);
    }
}

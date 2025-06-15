

public class RepeatedSubs {
    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        String trimmed = doubled.substring(1, doubled.length() - 1);
        return trimmed.contains(s);
    }

    public static void main(String[] args) {
        String input = "abcabcabcabc";
        boolean result = repeatedSubstringPattern(input);

        if (result) {
            System.out.println("The string can be formed by repeating a substring.");
        } else {
            System.out.println("The string cannot be formed by repeating a substring.");
        }
    }
}

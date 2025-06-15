
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        String pref = strs[0];  // Assume the first string is the prefix
        int prefLen = pref.length();

        for (int i = 1; i < strs.length; i++) {
            while (prefLen > strs[i].length() || !strs[i].substring(0, prefLen).equals(pref.substring(0, prefLen))) {
                prefLen--;
                if (prefLen == 0) return "";
            }
            pref = pref.substring(0, prefLen); // update prefix to shorter match
        }

        return pref;
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};

        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: \"" + result + "\"");
    }
}

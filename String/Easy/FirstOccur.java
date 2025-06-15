public class FirstOccur {
    public static int strStr(String haystack, String needle) {
        int windowSize = needle.length();
        for(int i=0;i<=haystack.length()-windowSize;i++){
            if(haystack.substring(i,i+windowSize).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        int res = strStr(haystack, needle);
        System.out.println(res);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String SortedKey = new String(chars);

            if(!map.containsKey(SortedKey)){
                map.put(SortedKey,new ArrayList<>());
            }
            map.get(SortedKey).add(str);
        }
        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
    String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    List<List<String>> grouped = groupAnagrams(strs);

    System.out.println("Grouped Anagrams:");
    for (List<String> group : grouped) {
        System.out.println(group);
    }
}

}

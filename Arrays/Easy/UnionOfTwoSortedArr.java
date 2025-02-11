
import java.util.*;
public class UnionOfTwoSortedArr{
    //Method-1 : Brute Force - used Hash set to remove duplicates and put it to Arraylist and sort them to maintain the order. Time complexity: O(n+m)log(m+n) , Space Complexity: O(m+n).
    public static ArrayList<Integer> Union(int[] a,int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:a) set.add(i);
        for(int j:b) set.add(j);

        list.addAll(set);
        Collections.sort(list);
        return list;
    }

    public static void main(String[] args){
        int[] a = {1,2,3,3,4};
        int[] b = {4,4,5,6,7};
        ArrayList<Integer> result = Union(a,b);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
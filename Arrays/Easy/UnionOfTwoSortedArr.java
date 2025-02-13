
import java.util.*;
public class UnionOfTwoSortedArr{
    //Method-1 : Brute Force - used Hash set to remove duplicates and put it to Arraylist and sort them to maintain the order. Time complexity: O(n+m)log(m+n) , Space Complexity: O(m+n).
    /*
    public static ArrayList<Integer> Union(int[] a,int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i:a) set.add(i);
        for(int j:b) set.add(j);

        list.addAll(set);
        Collections.sort(list);
        return list;
    }
    */

   //Method 2- Two pointers- Time Complexity - O(m+n) 
   public static ArrayList<Integer> Union(int[] a,int[] b){
        ArrayList<Integer> list = new ArrayList<>();
        int i=0,j=0;
        int n = a.length;
        int m = b.length;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                if(list.size()==0 || list.get(list.size()-1)!=a[i]){
                    list.add(a[i]);
                }
                i++;
            }   
            else{
                if(list.size()==0 || list.get(list.size()-1)!=b[j]){
                    list.add(b[j]);
                }
                j++;
            }
        }
        // Add remaining elements of 'a'
        while(i<n){
            if(list.get(list.size()-1)!=a[i]){
                list.add(a[i]);
            }
            i++;
        }
        // Add remaining elements of 'b'
        while(j<m){
            if(list.get(list.size()-1)!=b[j]){
                list.add(b[j]);
            }
            j++;
        }
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
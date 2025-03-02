/*You are given two 2D integer arrays nums1 and nums2.
nums1[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
nums2[i] = [idi, vali] indicate that the number with the id idi has a value equal to vali.
Each array contains unique ids and is sorted in ascending order by id.
Merge the two arrays into one array that is sorted in ascending order by id, respecting the following conditions:
Only ids that appear in at least one of the two arrays should be included in the resulting array.
Each id should be included only once and its value should be the sum of the values of this id in the two arrays. If the id does not exist in one of the two arrays, then assume its value in that array to be 0.
Return the resulting array. The returned array must be sorted in ascending order by id.

Example 1:

Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
Output: [[1,6],[2,3],[3,2],[4,6]]*/

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Merge2DArr {
    public static int[][] mergeArrays(int[][] nums1, int[][] nums2){
        //Why TreeMap? It keeps keys sorted in ascending order automatically, so we don’t have to sort later.
        Map<Integer,Integer> mp = new TreeMap<>();
        for(int[] pair : nums1){
            mp.put(pair[0], mp.getOrDefault(pair[0], 0)+pair[1]);
        }
        for(int[] pair:nums2){
            mp.put(pair[0], mp.getOrDefault(pair[0], 0)+pair[1]);
        }
        int[][] res = new int[mp.size()][2];
        int index = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            res[index][0]= entry.getKey();
            res[index][1] = entry.getValue();
            index++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] nums1 = {{1, 2}, {2, 3}, {4, 5}};
        int[][] nums2 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] merged = mergeArrays(nums1, nums2);
        for(int[] pair:merged){
            System.out.println(Arrays.toString(pair));
        }
    }
    
}

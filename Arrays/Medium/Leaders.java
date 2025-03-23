/*
You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Leaders {

    //optimal approach -- Time Complexity -- O(N)
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> as = new ArrayList<>();
        int n = arr.length;
        as.add(arr[n-1]);
        int max = arr[n-1];
        for(int i = n-2;i>=0;i--){
            if(arr[i]>=max){
                max = Math.max(max,arr[i]);
                as.add(max);
            }
        }
        Collections.reverse(as);
        return as;
    }
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> res = leaders(arr);
        System.out.println(res);
    }
}

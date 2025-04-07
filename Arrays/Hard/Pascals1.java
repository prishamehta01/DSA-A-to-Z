/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown: */

import java.util.*;

public class Pascals1 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1); // First and last element of the row is always 1
                } else {
                    int val = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(val); // Sum of two elements above
                }
            }

            triangle.add(row);
        }

        return triangle;
    }
    public static void main(String[] args) {
        int n = 4;
        List<List<Integer>> l1 = generate(n);
        System.out.println(l1);

    }
}

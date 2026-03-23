package org.example;

public class FindSecondMaxIn2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {4, 5, 6},
                {9, 8, 7},
                {3, 1, 2}
        };

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                int val = a[i][j];

                if (val > max1) {
                    max2 = max1;
                    max1 = val;
                }
                else if (val > max2 && val < max1) {
                    max2 = val;
                }
            }
        }

        System.out.println("Maximum: " + max1);
        System.out.println("Second Maximum: " + max2);
    }
}

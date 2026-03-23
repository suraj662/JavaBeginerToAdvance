package org.example;

public class FindSecondMinIn2DArray {
    public static void main(String[] args) {
        int[][] a = {
                {4, 5, 6},
                {9, 8, 7},
                {3, 1, 2}
        };
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {

                int val = a[i][j];

                if (val < min1) {
                    min2 = min1;
                    min1 = val;
                }
                else if (val < min2 && val > min1) {
                    min2 = val;
                }
            }
        }

        System.out.println("Minimum: " + min1);
        System.out.println("Second Minimum: " + min2);

    }
}

package org.example;

public class NumberDiamond {

    //    1
    //  1 2 1
    //1 2 3 2 1
    //  1 2 1
    //    1
    public static void main(String[] args) {

        int n = 5; // number of rows in the top half (middle row included)
        int totalRows = 2 * n - 1; // total rows of diamond

        for (int i = 1; i <= totalRows; i++) {

            int row = (i <= n) ? i : totalRows - i + 1;


            for (int s = 1; s <= n - row; s++) {
                System.out.print("  ");
            }

            // Ascending numbers
            for (int j = 1; j <= row; j++) {
                System.out.print(j + " ");
            }

            // Descending numbers
            for (int j = row - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

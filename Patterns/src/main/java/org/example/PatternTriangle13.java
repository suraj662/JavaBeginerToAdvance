package org.example;

public class PatternTriangle13 {
    //*       *
    //* *   * *
    //* * * * *
    //* *   * *
    //*       *

    public static void main(String[] args) {
        int n = 5; // total rows
        int mid = n / 2 + 1; // middle row
        int stars = 1;       // stars on left/right wing
        int spaces = 3;      // initial middle spaces

        for (int i = 1; i <= n; i++) {

            if (i != mid) {
                // Left stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("* ");
                }

                // Middle spaces
                for (int j = 1; j <= spaces; j++) {
                    System.out.print("  ");
                }

                // Right stars
                for (int j = 1; j <= stars; j++) {
                    System.out.print("* ");
                }
            } else {
                // Middle row: full stars
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

            // Update stars and spaces
            if (i < mid) {
                stars++;
                spaces -= 2;
            } else {
                stars--;
                spaces += 2;
            }
        }
    }
}

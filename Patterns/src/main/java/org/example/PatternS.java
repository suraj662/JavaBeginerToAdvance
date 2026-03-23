package org.example;

//*****
//*
//*****
//    *
//*****

public class PatternS {
//    public static void main(String[] args) {
//        int n = 5;
//
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < n; j++) {
//                if(j == 0 ||                          // Left vertical spine
//                        (i < n/2 && j == n-1-i) ||        // Upper diagonal: positions (0,4),(1,3),(2,2)
//                        (i >= n/2 && j == i - n/2 + 1)) { // Lower diagonal: positions (2,2),(3,3),(4,4)
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }


    public static void main(String[] args) {

        int n = 5; // rows and columns

        for (int i = 1; i <= n; i++) {           // rows
            for (int j = 1; j <= n; j++) {       // columns

                if (
                        i == 1 ||                  // top line
                                i == n ||                  // bottom line
                                i == (n / 2) + 1 ||         // middle line
                                (j == 1 && i < (n / 2) + 1) ||     // upper left vertical line
                                (j == n && i > (n / 2) + 1)        // lower right vertical line
                )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
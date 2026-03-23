package org.example;

public class patternK {

    //*     *
    //*    *
    //*   *
    //*    *
    //*     *

//        public static void main(String[] args) {
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

        int n = 5;
        int width = 7;   // total columns

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= width; j++) {

                if (
                        j == 1 ||                       // left vertical
                                (i <= 3 && j == width - (i - 1)) ||  // top diagonal
                                (i > 3 && j == width - (n - i))      // bottom diagonal
                )
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

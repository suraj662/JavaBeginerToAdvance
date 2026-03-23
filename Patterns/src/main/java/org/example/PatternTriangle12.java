package org.example;



    public class PatternTriangle12 {

        //*
        //* *
        //* * *
        //* *
        //*

        public static void main(String[] args) {

            int n = 5;
            int st = 1;
            int sp = 0;

            for (int i = 1; i <= n; i++) {

                // spaces
                for (int j = 1; j <= sp; j++) {
                    System.out.print(" ");
                }

                // stars
                for (int k = 1; k <= st; k++) {
                    System.out.print("* ");
                }
                System.out.println();


                if (i < (n / 2 + 1)) {
                    st++;   // increasing half
                } else {
                    st--;   // decreasing half
                }
            }
        }


    }


package org.example;

public class print2DArrayevenNo {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},
                     {4,5,6},
                     {8,9,10}};

        for (int[] n: a){
            for (int num : n){
                if (num%2 == 0 ) System.out.println(num);
            }
        }
    }
}

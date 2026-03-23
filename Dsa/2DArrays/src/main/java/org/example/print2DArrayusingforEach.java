package org.example;

import java.util.Arrays;

public class print2DArrayusingforEach {
    public static void main(String[] args) {
        int[][] a = { {1,2,3},
                {4,5,6},
                {8,9,10}};
        for (int[] n:a){
            System.out.println(Arrays.toString(n));
        }
    }
}

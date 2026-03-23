package org.example;

import java.util.Arrays;

public class add2DArrays {
    public static void main(String[] args) {
        int[][] a = {{1,2},{2,1}};
        int[][] b = {{1,3},{4,2}};
        int[][] c = new int[a.length][a.length];

        for (int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}

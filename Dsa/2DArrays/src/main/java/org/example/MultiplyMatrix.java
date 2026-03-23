package org.example;

public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,2,1},{1,2,1}};
        int[][] b = {{1,3,1},{2,2,1},{1,6,2}};
        int[][] c = new int[a.length][a.length];
        //multiply
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i].length;k++){
                    c[i][j] += a[i][k]* b[k][j];
                }
            }
        }

        //print
        for (int[] n:c){
            for(int num: n){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

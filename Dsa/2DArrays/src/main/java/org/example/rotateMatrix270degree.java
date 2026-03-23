package org.example;

public class rotateMatrix270degree {
    //1.transpose
    //2.Reverse the column
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = a.length;
        int[][] b = new int[n][n];
        //rotate 270
        for (int i = 0; i < n; i++) {
             for(int j=0;j<n;j++){
                 b[n-j-1][i] = a[i][j];
             }
        }
        //print
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}

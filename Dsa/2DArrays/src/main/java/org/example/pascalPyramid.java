package org.example;

public class pascalPyramid {
    public static void main(String[] args) {
        int n=5;
        int sp = n-1;
        int[][] a = new int[n][];
        isPascal(a);
        //print pascal pyramid
        for (int i =0;i<a.length;i++){
            //space
            for (int s =0;s<sp;s++){
                System.out.print(" ");
            }
            //numbers
            for(int j =0;j< a[i].length;j++){
                System.out.print(a[i][j] + " ");
            }
            sp--;
            System.out.println();
        }
    }

    public static void isPascal(int[][] a){
        for(int i =0;i<a.length;i++){
            a[i] = new int[i+1];
            for (int j=0;j<=i;j++){
                if(j == 0|| i ==j){
                    a[i][j] = 1;
                }else{
                    a[i][j] = a[i-1][j-1] + a[i-1][j];
                }
            }
        }
    }
}

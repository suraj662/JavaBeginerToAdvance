package org.example;

public class Practice {
    //butterfly - pattern
    public static void main(String[] args){
        int n =5;
        //int spaces = n - 1;
        //int st = 1;
        //top part of butterfly
        for(int i=1;i <=2*n;i++){
            int row;
            if(i <= n){
                row =i;
            }else{
                row = 2*n - i;
            }

            //for top-left part of star
            for(int j=1;j<= row;j++){
                System.out.print("*");
            }
            //spaces
            for (int j=1;j<=2*(n-row);j++){
                System.out.print(" ");
            }
            //top-right part of star
            for(int j = 1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();



        }

    }

//    public static void main(String[] args){
//        int num =1;
//        int n=5;
//        for(int i=1;i<=n;i++){
//            for(int j=1; j<=i;j++){
//                System.out.print(num++ + " ");
//            }
//            System.out.println();
//        }
//    }

    //number diamond
//    public static void main(String[] args){
//        int n=5;
//
//        for(int i=1; i<= 2*n -1; i++){
//            int row;
//            if(i <= n){
//                row = i;
//            }else{
//                row = 2*n -i;
//            }
//
//            //spaces
//            for(int s=1; s <= n-row; s++){
//                System.out.print("  ");
//            }
//            //left-incremented part of triangle
//            for(int j=1 ; j<=row;j++){
//                System.out.print(j + " ");
//            }
//            for(int j=row -1; j >= 1; j--){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//
//        }
//    }

//    public static void main(String[] args){
//        int n=5;
//
//        for(int i=1; i<= 2*n -1; i++){
//            int row;
//            if(i <= n){
//                row = i;
//            }else{
//                row = 2*n -i;
//            }
//
//            //spaces
//            for(int s=1; s <= n-row; s++){
//                System.out.print(" ");
//            }
//            //left-incremented part of triangle
//
//                if(row == 1){
//                    System.out.print("*");   // only one star in top & bottom
//                }else{
//                    System.out.print("*");  //left boundary
//
//                    for(int s=1; s<= 2*row -3; s++){
//                        System.out.print(" ");  //hollow middle
//                    }
//                    System.out.print("*");   //right boundary
//                }
//
//            System.out.println();
//
//        }
//    }

}

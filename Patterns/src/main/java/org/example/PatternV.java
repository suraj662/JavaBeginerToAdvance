package org.example;
import java.util.Scanner;

public class PatternV {
    //*       *
    //  *   *
    //    *

    public static void main(String[] args){
        int n =5;
        for(int i=1; i<= n;i++){
            for(int j=1;j<=n;j++){
                if((i == j || i + j == n+1) && i <= n/2 +1 ){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    //Enter the value of n
    //5
    //*        *
    //**      **
    //***    ***
    //****  ****
    //**********
//    public static void main(String args[])
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the value of n");
//        int n = sc.nextInt();
//        // i loop : iterating n times
//        for (int i = 1; i <= n; i++)
//        {
//            // Part 1 : First Triangle
//            // j loop : iterating i times
//            for (int j = 1; j <= i; j++)
//            {
//                System.out.print("*");
//            }
//            // Part 2 : Spaces Triangle
//            // j loop : iterating n-i times
//            for (int j = i; j <= n - 1; j++)
//            {
//                System.out.print(" " + " ");
//            }
//            // Part 3 : Second Triangle
//            // j loop : iterating i times
//            for (int j = 1; j <= i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
}

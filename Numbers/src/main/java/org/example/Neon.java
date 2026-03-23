package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Neon {
    public static void main(String[] args) {
         int n=9;
         int sq = n*n;
         int sum =0;

         while(sq > 0){
             sum += sq % 10;
             sq = sq/10;
         }
         if(sum == n){
             System.out.println("Neon Numbers");
         }else{
             System.out.println("Not a Neon Numbers");
         }
    }
}
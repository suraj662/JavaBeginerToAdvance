package org.example;


import java.util.Arrays;

public class arrayIntroduction {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10; a[1] = 20; a[2] = 30; a[3] = 40; a[4] = 50;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
        System.out.println(a[3]);
        System.out.println(a[4]);
        for (int i=a.length-1;i>= 0;i--){
            System.out.println(a[i]);
        }
        //for each
        for (int n:a){
            System.out.println(n);
        }
        //initailization & Declaration
        System.out.println(Arrays.toString(a));

    }
}
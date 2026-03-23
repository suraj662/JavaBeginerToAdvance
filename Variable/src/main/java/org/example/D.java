package org.example;

public class D {

    public static void main(String[] args) {
        int k = 3;
        System.out.println(k);

        D.m1();
        System.out.println(k);
    }

    public static void m1(){
        int k = 4;
        System.out.println(k);
    }
}

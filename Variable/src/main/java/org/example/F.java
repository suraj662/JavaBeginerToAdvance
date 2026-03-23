package org.example;

public class F {

    static int i =1;
    public static void main(String[] args){
        System.out.println(F.i);
        F.i = 2;
        System.out.println(F.i);
    }
}

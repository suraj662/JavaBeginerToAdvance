package org.example;

public class Demo5 {
    public static void main(String[] args){
        double d = m1(10);
        System.out.println(d);
    }
    public static double m1(int a){
        System.out.println("m1 is executed" + a);
        return  5.5;
    }
}

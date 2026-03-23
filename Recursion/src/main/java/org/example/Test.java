package org.example;

public class Test {
    public static void m1(int i){
        if(i <0) return;
        System.out.println(i);
        m1(i-1);
    }

    public static void main(String[] args){
        m1(10);
    }
}

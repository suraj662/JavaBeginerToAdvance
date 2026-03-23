package org.example;

public class Test {
    //static variable

    static int i=20;
    public static void main(String[] args){
        int i=10;
        System.out.println(i);//10
        System.out.println(Test.i);//20
        Test.m1();
    }
    public static void m1(){
        System.out.println(i);//20
    }
}

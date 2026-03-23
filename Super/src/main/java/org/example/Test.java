package org.example;

class A{
    public static void m1(){
        B.m2();
    }
    static {
        System.out.println("statoc-block-A");
    }
}
class B extends A{
    public static void m2(){
    }
    static {
        System.out.println("Static-block-B");
    }
}

public class Test {
    static {
        A.m1();
        System.out.println("static-block-Test");
    }
    public static void main(String[] args) {
        System.out.println("Main executed");
    }
}
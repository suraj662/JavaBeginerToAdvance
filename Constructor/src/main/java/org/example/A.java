package org.example;

public class A {
    public A(){
        System.out.println("A() cons is executed");
    }
    public static void main(String[] args){
        new A();
        new A();
        new A();
    }
}

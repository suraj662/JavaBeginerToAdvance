package org.example;

import java.lang.foreign.SequenceLayout;

class A{}
class B extends A{}
class C {
    public void m1(A a){
        System.out.println("m1(A a)-C");
    }
    public void m1(B b){
        System.out.println("m1(B b)-C");
    }
}
class D extends C{
    public void m1(A a){
        System.out.println("m1(A a)-D");
    }
    public void m1(B b){
        System.out.println("");
    }
}

public class Test {
    public static void main(String[] args){
        
    }
}

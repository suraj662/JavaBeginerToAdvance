package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
abstract class A{
    abstract public void m1();
    abstract public void m2();
}

abstract class B extends A{
    public void m1(){
        System.out.println("M1()-B");
    }
}

class C extends B{
    public void m2(){
        System.out.println("M2()-C");
    }
}

public class Demo {
    public static void main(String[] args) {
      A a = new C();
      a.m1(); //m1()-B
      a.m2(); //m2()-C
    }
}
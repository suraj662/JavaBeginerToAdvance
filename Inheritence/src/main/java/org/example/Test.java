package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class A{
    int i = 10;
    public void m1(){
        System.out.println("m1().A");
    }
}
class B extends A{
    int j =20;
    public void m2(){
        System.out.println("M2().B");
    }
}
public class Test {
    public static void main(String[] args) {
          A a = new A();
          System.out.println(a.i);
          //System.out.println(a.j); -> C.T.E
         a.m1();
         //a.m2(); -> C.T.E

        B b = new B();
        System.out.println(b.i + "\t" + b.j);
        b.m1();
        b.m2();
    }
}
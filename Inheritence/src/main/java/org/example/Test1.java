package org.example;

class A1{
    int i=10;
    int j=20;
    public void m1(){
        System.out.println(i + "\t"+ j);
    }
}
class B1 extends A1{
    public void m2(){
        i=100;
        j=200;
    }
}
public class Test1 {
    public static void main(String[] args) {
        A1 a1 = new A1();
        a1.m1();
        B1 b1 = new B1();
        a1.m1();
        b1.m1();
    }
}

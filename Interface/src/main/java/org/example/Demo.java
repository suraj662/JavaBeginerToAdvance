package org.example;

interface I1{
    default void m1(){
        System.out.println("M1()-I1");
    }
}
interface I2{
    default void m2(){
        System.out.println("M2()-I2");
    }
}
abstract class A{
    public void m1(){
        System.out.println("m1()-A");
    }
}
class B extends A implements I1,I2{
    @Override
    public void m1() {

            I1.super.m1(); //m1()-I1
            super.m1();
            //I2.super.m1(); //m1()-I2
        System.out.println("m1()-B");
        }
}
public class Demo {
    public static void main(String[] args) {
        new B().m1();
    }
}

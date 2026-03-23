package org.example;

class A_1{
    A_1(){
        this(10);
        System.out.println("A()-cons");
    }
    A_1(int i){
        //this();
        System.out.println("A(int i)-cons"+ i);
    }
    class B_1 extends A_1{
        B_1(){
            this(10);
            System.out.println("B()-cons");
        }
        B_1(int i){
            System.out.println("B(int i)-cons"+ i);
        }
    }
    class C_1 extends B_1{
        C_1(){
            System.out.println("C_1()-cons");
        }
        C_1(int i){
            this();
            System.out.println("C_1(int i)-cons"+ i);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        //new C_1(10);
    }
}

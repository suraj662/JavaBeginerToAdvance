package org.example;

public class B {
    B(int i){
        System.out.println("B(int i) is executed " + i);
    }
    public static void main(String[] args){
        //new B(); // C.T.E
        new B(10);
        new B(20);
    }
}

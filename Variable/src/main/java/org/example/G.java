package org.example;

public class G {
    static int i = 10;
    public  static void main(String[] args){
        G.m1();
        G.i = 20;
        G.m1();
    }
    public static void m1(){
        System.out.println("m1 starts");
        System.out.println(G.i);
        System.out.println("m1 ends");
    }
}

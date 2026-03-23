package org.example;

public class Test1 {
    //non-static variable
    int i=10;
    int j=20;

    public static void main(String[] args){
        Test1 t = new Test1();
        System.out.println(t.i);//10
        System.out.println(t.j);//20
    }
}

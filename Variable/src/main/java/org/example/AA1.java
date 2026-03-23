package org.example;

public class AA1 {
    static int i = 10;
    int j = 20;
    public static void main(String[] args){
        int i = 30;
        AA1 a = new AA1();
        System.out.println(a.i);//10
        System.out.println(a.j);//20
    }
}

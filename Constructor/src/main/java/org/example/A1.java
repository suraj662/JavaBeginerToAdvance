package org.example;

public class A1 {
    //this keyword
    A1(){
        System.out.println("A()-CONS");
    }
    A1(int i){
       this(i,i);
       System.out.println("A(int i)" + i);
    }
    A1(int i,int j){
        this();
        System.out.println("A(int i,int j)"+ i +","+ j);
    }
    public static void main(String[] args){
        new A1(10);
    }

}

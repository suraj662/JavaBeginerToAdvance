package org.example;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class A {
    A(){
        System.out.println("A()-cons");
    }
    A(int i){
        this(i,i);
        System.out.println("A(int i)"+ i);
    }
    A(int i,int j){
        this();
        System.out.println("A(int i,int j)"+ i + " " + j);
    }
    public static void main(String[] args) {
        new A(10);
    }
}
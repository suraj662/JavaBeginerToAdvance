package org.example;

import javax.swing.plaf.PanelUI;
import java.sql.SQLOutput;

abstract class A1{
    abstract public void m1();
    }
    class B1 extends A1{
        @Override
        public void m1(){
        System.out.println("M1()-B");
    }
    }

public class Demo1 {
    public static void main(String[] args){
        A1 b = new B1();
        b.m1();
    }
}

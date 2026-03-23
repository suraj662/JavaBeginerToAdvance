package org.example;

public class A {
    public static void main(String[] args){
        int a =5;
        a *= 6;
        System.out.println(a);//3
        a =+ 6;
        System.out.println(a);//6
        a =- 6;
        System.out.println(a);//-6
        //a =* 6; -> C.T.E
        //a =/ 6; -> C.T.E

        int b = 4637;
        b /= 10;
        System.out.println(b);//463
        b /= 10;
        System.out.println(b);//46

    }
}

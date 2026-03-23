package org.example;

public class Fiborec {
    public static void fibo(int a , int b , int fibonacci){
        //base case
        if( fibonacci == 0){
            return;
        }
        System.out.print(a + " ");

//        int next = a + b;   // next = a + b
//        a = b;              // new a = b
//        b = next;           // new b = next

        fibo(b , a+b ,fibonacci -1);


    }
    public static void main(String[] args){
        int limit =10;
        fibo(0,1,limit);

    }
}

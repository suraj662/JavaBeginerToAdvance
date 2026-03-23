package org.example;

class AA1{
    AA1(){
        System.out.println("A()-cons");
    }
    AA1(int i){
        this();
        System.out.println("A(int i)-cons"+ i);
    }
}
class BB1 extends AA1{
    BB1(){
        this(10);
        System.out.println("B()-cons");
    }
    BB1(int i){
        System.out.println("B(int i)-cons"+i);
    }
}
class CC1 extends BB1{
    CC1(){
        System.out.println("C()-cons");
    }
    CC1(int i){
        this();
        System.out.println("C(int i)-cons"+ i);
    }
}
public class Test1 {
    public static void main(String[] args){
        new CC1(10);
    }
}

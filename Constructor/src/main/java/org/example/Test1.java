package org.example;
class A2{
    A2(int i){
        System.out.println("A(int i)-cons"+ i);
    }
}
class B1 extends A2{
    B1(int i){
        super(i);
        System.out.println("B(int i)-cons"+ i);
    }
}
class C extends B1{
    C(){
        super(20);
    }
}
public class Test1 {
    public static void main(String[] args){
        new C();
    }

}

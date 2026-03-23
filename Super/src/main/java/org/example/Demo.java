package org.example;
class AA{
    int i=10;
    int j=20;
}
class BB extends AA{
    int i =100;
    int j = 200;

    public void m1(){
        System.out.println(i + "\t" + j);
        System.out.println(super.i + "\t" + super.j);
    }
}
class CC extends BB{
    int i =1000;
    int j = 2000;
    public void m2(){
        m1();
        System.out.println(i + "\t" + j);
        System.out.println(super.i + "\t" + super.j);
    }
}
public class Demo {
    public static void main(String[] args){
        CC c = new CC();
        c.m2();
    }
}

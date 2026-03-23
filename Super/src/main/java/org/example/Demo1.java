package org.example;

class AA3{
    static {
        System.out.println("Static Block 1_AA");
    }
    {
        System.out.println("Non Static-Block2_AA");
    }
    AA3(){
        System.out.println("AA() const");
    }
}
class BB3 extends AA3{

        static{
        System.out.println("Static Block 1_BB");
    }
    {
        System.out.println("Non Static-Block2_BB");
    }
    BB3(){
        System.out.println("BB() const");
    }
    }

public class Demo1 {
    public static void main(String[] args) {
        new BB3();
    }
}


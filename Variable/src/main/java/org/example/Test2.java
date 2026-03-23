package org.example;
  //non-static
public class Test2 {
    int i=10;
    static int j=20;
    public static void main(String[] args){
        int k =30;//local variable
        System.out.println(k);//30
        System.out.println(Test2.j);//20
        Test2 t = new Test2();
        System.out.println(t.i);//10

    }
}

package org.example;

public class Test {
    int i;
    int j;
    Test(int a,int b){
        i=a;
        j=b;
    }
    public static void  main(String[] args){
        Test t1 = new Test(10,20);
        System.out.println(t1.i + "\t" + t1.j);
        Test t2 = new Test(30,40);
        System.out.println(t2.i + "\t" + t2.j);
    }
}

package org.example;
  //non-static
public class Test3 {
    int i = 10;//non-static var
    static int j = 20;//static var

      public static void main(String[] args){
          int k =30;
          System.out.println(k);//localvar
          System.out.println(Test3.j);//20
          Test3 t = new Test3();
          System.out.println(t.i);//10
      }

}

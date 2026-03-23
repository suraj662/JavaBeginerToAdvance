package org.example;

public class B {
    public static void main(String[] args){
        System.out.println("B class is executed");
    }
}
class C {  //we cannot create more than one public class in a java file
           // without main method ,we cannot run java program
    public static void main(String[] args){
        System.out.println("C class is executing");
    }
}

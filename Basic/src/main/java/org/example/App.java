package org.example;

public class App {
    public static void main(String[] args){
       System.out.println("App starts");
       Qspiders.register();
       System.out.println("App ends");
    }
}
class Qspiders{
    public static void register(){
        System.out.println("Qspider Registration done sucess");
    }
}

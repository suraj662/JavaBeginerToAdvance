package org.example;

public class Jspiders {
    public  static void main(String[] args){
        System.out.println("App starts");
        Jspiders.register();
        Qspider.register();
        register();
        System.out.println("Apps ends");
    }
    public static void register(){
        System.out.println("Jspiders Registration Done sucess");
    }
}
class Qspider{
    public static void register(){
        System.out.println("Qspider Registrations Done Sucess");
    }
}

package org.example;

interface Washable{
    //marker
}
class Car implements Washable{
}
class Laptop { }
class Bike implements Washable{ }
class Mobile { }
public class WasherMan {
    public static void wash(Object o){
        if(o instanceof Washable){
            System.out.println(o.getClass().getSimpleName() + "is Washed");
        }else{
            System.out.println(o.getClass().getSimpleName() + " is not washed");
        }
    }
    public static void main(String[] args) {
        wash(new Car());
        wash(new Bike());
        wash(new Mobile());
        wash(new Laptop());
    }
}
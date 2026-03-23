package org.example;

class Animal {
    public void eat(){
        System.out.println("Animal-eat()");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Bow -Bow");
    }
}
class BabyDog extends Dog{
    public void weep(){
        System.out.println("Weeping");
    }
}
public class AnimalDriver {
    public static void main(String[] args) {
        Animal a = new Dog(); //Upcasting)(Dog-Animal)
        a.eat();
        Dog d = new BabyDog();
        d.bark();//Bow-Bow
        d.eat();//Animal eat
        //d.weep(); error

    }
}

package org.example;
//Multi-Level Inheritance
class Animal{
    public void eat(){
        System.out.println("Animal-eat");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog-bark");
    }
}
class BabyDog extends Dog{
    public void weep(){
        System.out.println("BabyDog is weeping");
    }
}
public class AnimalDriver {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        //a.bark(); -> error
        //a.weep(); error

        Dog d = new Dog();
        d.eat();
        d.bark();
        //d.weep(); error

        BabyDog b = new BabyDog();
        b.eat();
        b.bark();
        b.weep();
    }
}

package org.example;

public class AnimalDriver {
    public static void main(String[] args){
        Animal a = new Dog();
        a.eat();
        Dog d = (Dog) a;
        d.eat(); //Dog-eat
        //BabyDog b = (BabyDog) a; //C.C.E

        Animal a1 = new BabyDog(); //upcasting(BabyDog - Animal)
        a1.eat(); //BabyDog
        Dog d1 = (Dog) a1; //Downcasting(Animal - Dog)
        d1.eat(); //Babydog
        d1.bark(); //Babydog
        //d1.weep(); -> C.T.E
        BabyDog b1 = (BabyDog) d1; //downcasting(Dog - BabyDog)
        BabyDog b2 = (BabyDog) a1; //downcasting (Animal - Babydog)
        b1.eat(); //babydog
        b1.bark(); //babydog
        b1.weep(); //babydog
        System.out.println("=========================================");
        b2.eat();
        b2.bark();
        b2.weep();
    }
}

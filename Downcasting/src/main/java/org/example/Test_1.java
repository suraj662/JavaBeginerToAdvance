package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Animal{
    public void eat(){
        System.out.println("Animal-eat");
    }
}

class Dog extends Animal{
    public void eat(){
        System.out.println("Dog-eat");
    }
    public void bark(){
        System.out.println("Dog-eat");
    }
}

class BabyDog extends Dog{
    public void eat(){
        System.out.println("BabyDog-eat");
    }
    public void bark(){
        System.out.println("BabyDog-bark");
    }
    public void weep(){
        System.out.println("Weeping");
    }
}

class Cat extends Animal{
    public void eat(){
        System.out.println("cat-eat");
    }
}



public class Test_1 {

    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a instanceof Animal); //true
        System.out.println(a instanceof Dog);//true
        System.out.println(a instanceof BabyDog);//false
        System.out.println(a instanceof Cat);//false
        System.out.println("========================================");

        a = new BabyDog();
        System.out.println(a instanceof Animal); //true
        System.out.println(a instanceof Dog);  //true
        System.out.println(a instanceof BabyDog); //true
        System.out.println(a instanceof Cat); //false
        System.out.println("======================================");

        a = new Cat();
        System.out.println(a instanceof Animal); //true
        System.out.println(a instanceof Dog); //false
        System.out.println(a instanceof BabyDog); //false
        System.out.println(a instanceof Cat); //true
        System.out.println("========================================");
        Dog d = new Dog();
        Animal a1 = (Animal) d; //UPCASTING(dog - animal)
        Dog d1 = (Dog) a1; //downcasting(animal - dog)
    }
}
package org.example;


import java.util.Stack;

class Vehicle{ }
class Car extends Vehicle { }
class Bike extends Vehicle { }

class BMW extends Car {
    public static void driver(Car C) { }
    public static void driver (Bike b) { }
    public static void driver(Vehicle v) { }
}

class Benz extends Car{
    public static void driver(Car C) { }
    public static void driver (Bike b) { }
    public static void driver(Vehicle v) { }
}

class Audi extends Car {
    public static void driver(Car C) { }
    public static void driver (Bike b) { }
    public static void driver(Vehicle v) { }
}

class RV100 extends Bike {
    public static void driver(Car C) { }
    public static void driver (Bike b) { }
    public static void driver(Vehicle v) { }
}

class RE extends Bike {
    public static void driver(Car C) { }
    public static void driver (Bike b) { }
    public static void driver(Vehicle v) { }
}

public class VehicleDriver {
    public static void drive_1(Car c){
        System.out.println();
    }
    public static void main(String[] args) {
        
    }
}
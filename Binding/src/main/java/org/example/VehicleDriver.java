package org.example;


import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Vehicle{
public void start(){}
public void accelerate(){}
public void stop(){}
}

class BMW extends Vehicle{
    public void start(){
        System.out.println("BMW started");
    }
    public void accelerate(){
        System.out.println("BMW going");
    }
    public void stop(){
        System.out.println("BMW stopped");
    }
}
class Audi extends Vehicle{
    public void start(){
        System.out.println("Audi started");
    }
    public void accelerate(){
        System.out.println("Audi going");
    }
    public void stop(){
        System.out.println("Audi stopped");
    }
}

class Benz extends Vehicle{
    public void start(){
        System.out.println("Benz started");
    }
    public void accelerate(){
        System.out.println("Benz going");
    }
    public void stop(){
        System.out.println("Benz stopped");
    }
}
public class VehicleDriver {
    public static void drive(Vehicle v){
        v.start();
        v.accelerate();
        v.start();
    }
    public static Vehicle getCar(){
        Scanner s = new Scanner(System.in);
        System.out.println("1.BMW\n2.Audi\n3.Benz\n4.None");
        int n =s.nextInt();
        if (n ==1) return new BMW();
        else if (n == 2) return new Audi();
        else if (n == 3) return new Benz();
        else {
            System.out.println("Invalid Input");
            return null;
        }


    }
    public static void main(String[] args) {
        drive(getCar());

    }
}
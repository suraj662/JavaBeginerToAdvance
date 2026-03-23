package org.example;

public class Car {
    String color;
    static int num = 1000;
    int regNum;

    Car(String c){
        color = c;
        regNum = num++;
    }
    public static void main(String[] args){
        Car c1 = new Car("white");
        Car c2 = new Car("black");
        c1.regNum = 1111;
        System.out.println(c1.color + "\t" + c1.regNum);
        System.out.println(c2.color + "\t" + c2.regNum);
    }
}

package org.example;

public class Box {
    int length;
    int breadth;
    int height;

    Box(int i){
        length =i;
        breadth=i;
        height =i;
    }
    public Box(int length,int breadth,int height){
        this.length =length;
        this.breadth = breadth;
        this.height = height;
    }

    public void display(){
        System.out.println("length:"+length);
        System.out.println("breadth :"+ breadth);
        System.out.println("Height:"+height);
    }

    public static void main(String[] args){
        Box b1 = new Box(10);
        b1.display();
        Box b2 = new Box(5,10,15);
        b2.display();
    }
}

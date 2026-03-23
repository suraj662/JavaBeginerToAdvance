package org.example;

class Phone{
    String name;
    int num;
    String color;

    public Phone(String name,int num,String color){
        this.name = name;
        this.num = num;
        this.color = color;
    }
}
class SmartPhone extends Phone{
    int ram;
    int rom;
    int pxl;

    public SmartPhone(String name,int num,String color,int ram,int rom,int pxl){
        super(name,num,color);
        this.ram = ram;
        this.rom= rom;
        this.pxl = pxl;
    }

    public void display(){
        System.out.println(name + "\n" + num + "\n"+ color + "\n" + ram + "\n" + rom + pxl);
    }
}

public class MobileDriver {
    public static void main(String[] args){
        SmartPhone s =new SmartPhone("Asus",1,"bllue",4,512,50);
        s.display();
    }
}

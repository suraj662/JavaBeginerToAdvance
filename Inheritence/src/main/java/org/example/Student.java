package org.example;

public class Student {
    String name;
    int age;
    int id;
    long mobile;

    Student(){

    }
    Student(String name){
        this();
        this.name = name;
    }
    Student(String name,int age){
        this(name);
        this.age = age;
    }
    Student(String name,int age,int id){
        this(name,age);
        this.id = id;
     }
    Student(String name,int age,int id ,long mobile){
        this(name,age,id);
        this.mobile = mobile;
    }
    public void display(){
        System.out.println("student name:"+ name);
        System.out.println("student age:" + age);
        System.out.println("student id:" + id);
        System.out.println("student id:"+ id);
        System.out.println("Student mobile:"+ mobile);
    }

    public static void main(String[] args){
        Student s1 =new Student("Avyak",25,1,987654321);
        s1.display();

        Student s2 = new Student("Ram");
        s2.display();
    }

}

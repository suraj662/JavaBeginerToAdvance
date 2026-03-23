package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Book {
    String name;
    String author;
    double price;

    public static Book getBook(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the details:");
        Book b = new Book();
        b.name = s.next();
        b.author = s.next();
        b.price = s.nextDouble();
        return  b;
    }

    public void display(){
        System.out.println("Book name "+ name);
        System.out.println("Book author"+ author);
        System.out.println("Book price"+ price);
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
    }
}
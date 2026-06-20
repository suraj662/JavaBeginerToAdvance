package com.example.democore123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Democore123Application {

    public static void main(String[] args) {

        SpringApplication.run(Democore123Application.class, args);

        String ans = print();
        System.out.println(ans);
        System.out.println("Democore123 Application Started");
    }

    static String print(){
        return "Hello World!";
    }

}

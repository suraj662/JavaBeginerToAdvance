package org.example;
import java.util.*;

public class Employee {

    private int id;
    private String name;
    private int age;
    private String department;
    private double salary;
    private String city;
    private int experience;

    // Constructor
    public Employee(int id, String name, int age, String department, double salary, String city, int experience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.city = city;
        this.experience = experience;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public String getCity() {
        return city;
    }

    public int getExperience() {
        return experience;
    }

    // toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                ", experience=" + experience +
                '}';
    }
}
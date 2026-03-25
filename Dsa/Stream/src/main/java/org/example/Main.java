package org.example;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main() {

//        int n =17;
//        System.out.println(n + "is a prime " +  isPrime(n));
//
//        //print prime number in range
//        int st = 1;
//        int end =100;
//        List<Integer> primeNo = IntStream.rangeClosed(st , end)
//                .filter(Main :: isPrime)
//                .boxed()
//                .collect(Collectors.toList());
//        System.out.println("prime no between " + st + " and " + end + " is " + primeNo);


        List<Employee> employees = List.of(
                new Employee(1,"Suraj",24,"IT",70000,"Delhi",2),
                new Employee(2,"Rahul",30,"HR",50000,"Mumbai",5),
                new Employee(3,"Amit",28,"IT",80000,"Bangalore",4),
                new Employee(4,"Neha",26,"Finance",65000,"Delhi",3),
                new Employee(5,"Priya",32,"IT",90000,"Pune",7),
                new Employee(6,"Ravi",29,"HR",55000,"Chennai",4)
        );

        //Filter employees name with salary > 60000
//        employees.stream().filter(e -> e.getSalary() > 60000)
//                .forEach(e -> System.out.println(e.getName()));


        //Get employee names
//        employees.stream()
//                .map(e -> e.getName())
//                .forEach(name -> System.out.println(name));

        //Find employee details of highest salary
        employees.stream()
                .max((e1 , e2) -> Double.compare(e1.getSalary() , e2.getSalary()))
                .ifPresent(e -> System.out.println(e));

    }

    //check prime number using stream

    public static boolean isPrime(int number){
        if(number <= 1)
            return false;

        return IntStream
                .range(2 , (int)Math.sqrt(number))
                .noneMatch( i -> number % i == 0);
    }

    //generate prime number in range


}

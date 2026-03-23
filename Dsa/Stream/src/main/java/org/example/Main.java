package org.example;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Main {
    public static void main() {
        int n =17;
        System.out.println(n + "is a prime " + isPrime(n));

        int st = 1;
        int end =100;
        List<Integer> primeNo = IntStream.rangeClosed(st , end)
                .filter(Main :: isPrime)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("prime no between " + st + " and " + end + " is " + primeNo);
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

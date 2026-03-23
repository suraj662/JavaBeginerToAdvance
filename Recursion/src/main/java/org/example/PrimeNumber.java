package org.example;

public class PrimeNumber {

    public static boolean isPrime(int n , int i){
        //base condition
        if(n <= 1) return false;
        if(i * i > n) return true;
        if(n % i == 0) return false;

        return isPrime(n, i+1);

    }

    public static void main(String[] args){
    int num = 29;   // change value to test

        if (isPrime(num, 2))
            System.out.println(num + " is Prime");
        else
                System.out.println(num + " is NOT Prime");

}
        }
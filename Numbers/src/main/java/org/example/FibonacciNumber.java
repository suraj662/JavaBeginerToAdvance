package org.example;

public class FibonacciNumber {
    public static void main(String[] args) {
        int a = 0, b = 1, n = 11;
        System.out.println(a + " " + b + " ");

        for(int i=2; i<=n;i++){
            int c =a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

    }
}

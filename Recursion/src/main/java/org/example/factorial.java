package org.example;

public class factorial {
    public static void fact(int i ,int fact){
        if(i < 1){
            System.out.println(fact);
            return;
        }
        fact *= i;
        fact(i-1,fact);
    }
}

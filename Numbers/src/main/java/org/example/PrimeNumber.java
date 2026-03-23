package org.example;

public class PrimeNumber {
    public static void main(String[] args){
        int n = 13 , c = 0;


        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                c++;
                break;

            }
        }
        if(c==0)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
}

package org.example;

public class StrongNumber {
    //Sum of factorial of digits = number
    //Example: 145 → 1!+4!+5! = 145

    public static void main(String[] args){
        int n=1445 , temp = n, sum =0;

        while (n > 0){
            int r = n%10;
            int fact = 1;

            for(int i=1 ; i<=r; i++){
                fact *= i;
            }
            sum += fact;
            n = n/10;
        }

        if(sum==temp)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong");

    }
}

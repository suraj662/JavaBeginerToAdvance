package org.example;

public class SpyNumber {
    //Sum of digits = Product of digits
    //Example 1124 → sum=1+1+2+4=8 , product=8

    public static void main(String[] args){
        int n =1124;
        int sum =0 , prod =1;

        while(n > 0){
            int r = n%10;
            sum += r;
            prod *= r;
            n = n/10;
        }
        if(sum == prod){
            System.out.println("Spy Number");
        }else{
            System.out.println("Not Spy Number");
        }
    }
}

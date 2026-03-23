package org.example;

public class ArmstrongNumber {
    //Example (3-digit)
    //
    //153
    //
    //Digits: 1, 5, 3
    //Number of digits = 3
    //1³ + 5³ + 3³
    //= 1 + 125 + 27
    //= 153 → Armstrong ✔

    public static void main(String[] args){
        int n = 153, temp = n , sum = 0;

        // count digits
        int digits = 0;
        int t = n;
        while (t > 0){
            t /= 10;
            digits++;
        }
        //Armstrong Logic
        while(temp > 0){
            int r = temp % 10;
            int power =1;
            for(int i=1; i <= digits; i++){
                power *= r;
            }
            sum += power;
            temp /= 10;
        }
        if(sum == n)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}

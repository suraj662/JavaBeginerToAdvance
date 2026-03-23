package org.example;

public class PalindromeNumber {

   //Example
   //
   //145
   //
   //Digits: 1, 4, 5
   //1! + 4! + 5!
   //= 1 + 24 + 120
   //= 145 → Strong Number ✔
    public static void main(String[] args){
        int n =121;
        int m = n;
        int rev =0;

        while (n > 0){
            int r = n% 10;
            rev = rev*10 + r;
            n = n/10;
        }
        if(m == rev){
            System.out.println("Palindrome Number");
        }else{
            System.out.println("Not Palindrome Number");
        }
    }
}

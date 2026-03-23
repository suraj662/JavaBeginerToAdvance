package org.example;

public class MyClass {
    public static void main(String args[]) {
        int n =28;
        System.out.println(PerfectNum(1,n,0));

        int n1 =6;
        System.out.println(isSpy(n1,0,1));

        int n2 =9;
        System.out.println(neon(n2,n2*n2,0));

        int n4= 121;
        System.out.println(isPalindrome(n4,n4,0));

        int n5 = 145;
        System.out.println(Strong(n5, n5,0,1));

        int n6 = 153;
        System.out.println(Armstrong(n6 , n6,0));

        int n7 = 25;
        System.out.println(Automorphic(n7 , n7*n7));

        PerfectRange(1, 100);
        System.out.println();


        SpyRange(1, 100);
        System.out.println();


        NeonRange(1, 100);
        System.out.println();


        PalindromeRange(1, 200);
        System.out.println();


        StrongRange(1, 500);
        System.out.println();


        ArmstrongRange(1, 500);
        System.out.println();


        AutomorphicRange(1, 200);
        System.out.println();

    }

    public static boolean PerfectNum(int i,int n, int sum ){
        if(i > n/2) return n ==sum;
        if(n%i == 0) sum += i;
        return PerfectNum(i+1,n,sum);

    }

    public static boolean isSpy(int n ,int sum ,int prod){
        if(n == 0) return sum == prod;
        sum += n%10;
        prod *= n%10;

        return isSpy(n/10 , sum , prod);
    }

    public static boolean neon(int n , int sq , int sum ){
        if(sq == 0) return sum == n;
        sum += sq%10;

        return neon(n,sq/10,sum);
    }

    public static boolean isPalindrome(int n,int m, int rev){
        if(n == 0) return m == rev;
        rev = rev*10 + n%10;

        return isPalindrome(n/10 , m ,rev);
    }

    public static boolean Strong(int n , int temp,int sum, int fact){
        if(temp == 0) return sum == n;
        int digit = temp%10;

        fact =1;
        for(int i=1;i<=digit; i++){
            fact *= i;
        }

        return Strong(n , temp/10 ,sum+ fact ,1);
    }

    public static boolean Armstrong(int n,int temp,int sum){
        if(temp == 0)return sum == n;
        int digit = temp%10;
        int digits = countDigits(n);

        int power =1;
        for(int i=1;i<=digits;i++){
            power *= digit;
        }

        return Armstrong(n,temp/10,sum + power);
    }

    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }

    public static boolean Automorphic(int n, int sq){
        if(n == 0) return true;

        if(n%10 != sq%10) return false;

        return Automorphic(n/10, sq/10);
    }


// for calling ranges

    public static void PerfectRange(int start, int end) {
        if (start > end) return;

        if (PerfectNum(1, start, 0)) {
            System.out.print(start + " ");
        }

        PerfectRange(start + 1, end);
    }

    public static void SpyRange(int start, int end) {
        if (start > end) return;

        if (isSpy(start, 0, 1)) {
            System.out.print(start + " ");
        }

        SpyRange(start + 1, end);
    }

    public static void NeonRange(int start, int end) {
        if (start > end) return;

        if (neon(start, start * start, 0)) {
            System.out.print(start + " ");
        }

        NeonRange(start + 1, end);
    }

    public static void PalindromeRange(int start, int end) {
        if (start > end) return;

        if (isPalindrome(start, start, 0)) {
            System.out.print(start + " ");
        }

        PalindromeRange(start + 1, end);
    }

    public static void StrongRange(int start, int end) {
        if (start > end) return;

        if (Strong(start, start, 0, 1)) {
            System.out.print(start + " ");
        }

        StrongRange(start + 1, end);
    }

    public static void ArmstrongRange(int start, int end) {
        if (start > end) return;

        if (Armstrong(start, start, 0)) {
            System.out.print(start + " ");
        }

        ArmstrongRange(start + 1, end);
    }

    public static void AutomorphicRange(int start, int end) {
        if (start > end) return;

        if (Automorphic(start, start * start)) {
            System.out.print(start + " ");
        }

        AutomorphicRange(start + 1, end);
    }



}

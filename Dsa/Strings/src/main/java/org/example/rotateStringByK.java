package org.example;

public class rotateStringByK {
    public static void main(String[] args) {
        String s = "abcdef";
        int k = 3;
        k = k % s.length();
        System.out.println(s.substring(k) + s.substring(0,k));
    }
}

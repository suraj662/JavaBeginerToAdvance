package org.example;

public class sumOfDigitsinString {
    public static void main(String[] args) {
        String s = "ab12cd34";
        int sum =0;
        for(char c:s.toCharArray()){
            if(c >= '0' && c <= '9'){
                sum += (c - '0');
            }
        }
        System.out.println(sum);
    }
}

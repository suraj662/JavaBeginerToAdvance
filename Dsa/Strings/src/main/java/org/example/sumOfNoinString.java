package org.example;

public class sumOfNoinString {
    public static void main(String[] args) {
        String s = "abd12cd3";
        int sum =0;
        int num =0;
        for(char c: s.toCharArray()){
            if(c >= '0' && c <= '9'){
                num = num*10 + (c - '0');
            }else{
                sum += num;
                num =0;
            }
        }
        sum += num;
        System.out.println(sum);
    }
}

package org.example;

public class maxElemnetArray {
    public static void main(String[] args) {
        int[] a= {4,5,61,9,12,20,18};
        int max=0;
        for(int n:a){
            if(n > max){
                max = n;
            }
        }
        System.out.println(max);
    }
}

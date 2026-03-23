package org.example;

public class minElementArray {
    public static void main(String[] args) {
        int[] a = {10,1,6,5,9,2};
        int min=a[0];
        for(int n:a){
            if(min >n){
                min =n;
            }
        }
        System.out.println(min);
    }
}

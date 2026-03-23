package org.example;

public class printOddindexValue {
    public static void main(String[] args) {
        int[] a ={10,20,30,40,50,60};
        int count = 0;
        for(int n:a){
            if(n%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
}

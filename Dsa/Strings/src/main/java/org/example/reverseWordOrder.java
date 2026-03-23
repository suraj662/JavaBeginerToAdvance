package org.example;

public class reverseWordOrder {
    public static void main(String[] args) {
        String s = "java is oop";
        String[] w = s.split(" ");
        for(int i = w.length -1; i >= 0;i--){
            System.out.println(w[i] +  " ");
        }
    }
}

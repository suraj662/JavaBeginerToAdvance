package org.example;

public class longestWordinaString {
    public static void main(String[] args) {
        String s ="java is very powerful";
        String[] w = s.split(" ");
        String max = w[0];
        for(String x : w){
            if(s.length() > max.length()){
                max = x;
            }
        }
        System.out.println(max);
    }
}

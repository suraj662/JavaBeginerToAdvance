package org.example;

public class reverseEveryWordinSentence {
    public static void main(String[] args) {
        String s = " java is an oop lang";
        for (String w : s.split(" ")){
            String rev = "";
            for(int i=w.length()-1;i>=0;i--){
                rev += w.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }
}

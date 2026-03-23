package org.example;

public class reversEachOrderinSentence {
    public static void main(String[] args) {
        String s = "java is oop";
        for(String w : s.split(" ")){
            String r = "";
            for(int i=w.length()-1; i>= 0;i--){
                r += w.charAt(i);
            }
            System.out.print(r + " ");
        }
    }
}

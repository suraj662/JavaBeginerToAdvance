package org.example;

public class duplicateWords {
    public static void main(String[] args) {
        String s = "java is java oop is";
        String[] w = s.split(" ");
        for (int i=0;i<w.length; i++){
            for(int j =i+1;j<w.length;j++){
                if(w[i].equals(w[j])){
                    System.out.println(w[i]);
                }
            }
        }
    }
}

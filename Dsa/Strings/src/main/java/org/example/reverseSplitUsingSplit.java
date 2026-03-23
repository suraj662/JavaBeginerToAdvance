package org.example;

    //I/P - java is an oop lang
    //O/P - lang oop an is java
   //reverse sentence
public class reverseSplitUsingSplit {
    public static void main(String[] args) {
        String s1 = "java is an oop lang";
        String[] w = s1.split(" ");
        int n = w.length;
        String s2 = w[n-1];
        for (int i=n-2;i>=0;i--){
            s2 = s2 + " " + w[i];
        }
        System.out.println(s2);
    }
}

package org.example;

public class spiltMethod {
    //using spilt
    public static void main(String[] args) {
        String s ="java is an oop lang";
        String[] arr = s.split(" ");
        for (String w : arr){
            System.out.println(w);
        }

       printWords(s);
    }

    //without split
    public static void printWords(String s){
        String word ="";

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                word = word + ch;
            }else if(!word.isEmpty()){
                System.out.println(word);
                word ="";
            }
        }
        if (!word.isEmpty()) {
            System.out.println(word);
        }
    }
}

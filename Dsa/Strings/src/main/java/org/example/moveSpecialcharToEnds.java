package org.example;

import org.w3c.dom.ls.LSOutput;

public class moveSpecialcharToEnds {
    public static void main(String[] args) {
        String s = "a@b#c";
        String a = "";
        String b = "";

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                a += c;
            }
            else {
                b += c;
            }
        }
        System.out.println(a+b);
    }

}

package org.example;

public class occurenceOfeachCharacter {
    public static void main(String[] args) {
        String s = "developer";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == ' ') continue;
            int origLength = s.length();
            String temp = s.replace(String.valueOf(ch),"");
            int newLength = temp.length();
            int count = origLength - newLength;
            System.out.println(ch + " = " + count);

        }
    }
}

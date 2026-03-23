package org.example;

public class ToggleCase {
    //i/p =- JaVa
    //o/p - jAvA
    public static void main(String[] args) {
        String s = "JaVa";
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                ch[i] -= 32;
            }
            else if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] += 32;
            }
        }
        System.out.println(new String(ch));
    }
}

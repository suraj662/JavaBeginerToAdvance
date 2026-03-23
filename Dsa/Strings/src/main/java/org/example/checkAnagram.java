package org.example;

public class checkAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        System.out.println( isAnagram(s1,s2));
    }

    public static boolean isAnagram(String s1,String s2){
        if (s1.length() != s2.length())
            return false;
        while(s1.length() > 0){
            char ch = s1.charAt(0);
            if(s2.indexOf(ch) == -1) return false;
            s1 = s1.replaceFirst(String.valueOf(ch),"");
            s2 = s2.replaceFirst(String.valueOf(ch),"");
        }
        return true;
    }
}

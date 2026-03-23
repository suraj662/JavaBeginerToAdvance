package org.example;

public class convertLowerUpper {
    public static void main(String[] args) {
        String s = "sdbcjFUTEBC";
        String res1 = toLowerCase(s);
        String res2 = toUpperCase(s);
        System.out.println(res1);
        System.out.println(res2);

    }
    public static String toLowerCase(String s){
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length; i++){
            char curr = ch[i];
            if(curr >= 'A' && curr <= 'Z'){
                ch[i] = (char)(curr + 32);
            }
        }
        return new String(ch);
    }
    public static String toUpperCase(String s){
        char[] ch = s.toCharArray();
        for(int i=0;i< ch.length;i++){
            char curr = ch[i];
            if(curr >= 'a' && curr <= 'z'){
                ch[i] = (char)(curr - 32);
            }
        }
        return new String(ch);
    }
}

package org.example;

public class reverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String s1 = "java";
        StringBuilder sb = new StringBuilder();
        for(int i=s1.length()-1;i>=0;i--){
            char c = s1.charAt(i);
            sb.append(c);
        }
        String s2 = sb.toString();
        System.out.println(s2);
    }
}

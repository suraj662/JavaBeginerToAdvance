package org.example;

public class characterFrequency {
    public static void main(String[] args) {
        String s = "developer";
        int[] f = new int[26];
        for(char c : s.toCharArray()){
            f[c - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(f[i] > 0){
                System.out.println((char)(i + 'a') + "->" + f[i]);
            }
        }
    }
}

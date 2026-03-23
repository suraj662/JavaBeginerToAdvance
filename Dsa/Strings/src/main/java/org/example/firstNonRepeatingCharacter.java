package org.example;

public class firstNonRepeatingCharacter {
    public static void main(String[] args) {
        String s = "swiss";
        int[] f = new int[256];
        //count frequency
        for(char c:s.toCharArray())f[c]++;
        //find first non-repeating character
        for(char c : s.toCharArray()){
            if(f[c] == 1){
                System.out.println(c);
                break;
            }
        }
    }
}

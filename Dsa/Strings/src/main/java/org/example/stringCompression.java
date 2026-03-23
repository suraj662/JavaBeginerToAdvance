package org.example;

//Input  : aaabbcccdd
//Output : 3a2b3c2d

public class stringCompression {
    public static void main(String[] args) {
        String s = "aaabbcccdd";
        int count =0;
        for(int i=0; i<s.length();i++){
            if(i < s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
            }else{
                System.out.println(count +" = " + s.charAt(i));
                count =1;
            }
        }
    }
}

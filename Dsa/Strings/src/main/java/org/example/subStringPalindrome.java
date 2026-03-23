package org.example;

public class subStringPalindrome {
    public static void main(String[] args) {
        String s = "banana";
        int l = s.length();
        for (int i=0;i<l+1;i++){
            for (int j=i+1;j<l;j++){
                if(isPallen(s,i,j)){
                    System.out.println(s.substring(i , j+1));
                }
            }
        }
    }
    public static boolean isPallen(String s,int st,int end){
        while(st <end){
            if(s.charAt(st) != s.charAt(end) )
                return false;
            st++;
            end--;
        }
        return true;
    }
}

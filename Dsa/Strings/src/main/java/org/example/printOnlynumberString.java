package org.example;

public class printOnlynumberString {
    public static void main(String[] args) {
        String s = "sd46778n2";
        int i=0;
        int j=s.length();
        int sum =0;
        while (i<j){
            // skip non-digit characters
            while( i< j && (s.charAt(i) < '0' || s .charAt(i) > '9')){
                i++;
            }
            int num =0;
            // build number from consecutive digits
            while (i<j && s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                int n= s.charAt(i) - '0';
                num = num*10 +n;
                i++;
            }
            sum = sum * (int)Math.pow(10, String.valueOf(num).length()) + num;
        }
        System.out.println(sum);
    }
}

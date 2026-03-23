package org.example;

public class reverseHalfString {
    public static void main(String[] args) {
        String s = "developer";
        leftHalfReverse(s);
        rightHalfReverse(s);
        System.out.println("Without Substring -------------");
        leftHalfReverse1(s);
        rightHalfReverse1(s);
    }

    //using subString
    public static void leftHalfReverse(String s){
        int mid = s.length()/2;
        String left = s.substring(0 , mid);
        String right = s.substring(mid);
        String revLeft = "";
        for(int i= left.length() -1; i>= 0;i--){
            revLeft += left.charAt(i);
        }
        System.out.println(revLeft + right);
    }

    public static void rightHalfReverse(String s){
        int mid = s.length()/2;
        String left = s.substring(0 ,mid);
        String right = s.substring(mid);
        String revRight = "";
        for(int i= right.length()-1;i >=0;i--){
            revRight += right.charAt(i);
        }
        System.out.println(left + revRight);
    }

    //without using substring
    public static void leftHalfReverse1(String s){
        int len = s.length();
        int mid = len/2;
        String result = "";
        //reverse left half
        for(int i= mid-1; i >= 0; i-- ){
            result += s.charAt(i);
        }
        //append remaing part
        for(int i=mid;i<len; i++){
            result += s.charAt(i);
        }
        System.out.println(result);
    }

    public static void rightHalfReverse1(String s){
        int len = s.length();
        int mid = len/2;
        String result = "";
        //append left half
        for(int i=0;i < mid;i++){
            result += s.charAt(i);
        }
        //reverse left part
        for(int i=len-1; i >= mid;i--){
            result += s.charAt(i);
        }
        System.out.println(result);
    }

}

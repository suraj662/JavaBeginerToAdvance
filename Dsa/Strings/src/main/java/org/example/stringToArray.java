package org.example;


public class stringToArray {
    public static void main(String[] args) {
          String s= "developer";
          for (int i=0;i<s.length();i++){
              System.out.print(s.charAt(i));
          }
        System.out.println();
        System.out.println("----------");
          char[] ch = s.toCharArray();
          for(char c : ch){
              System.out.print(c);
          }
    }
}
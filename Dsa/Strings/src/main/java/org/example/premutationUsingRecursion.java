package org.example;

public class premutationUsingRecursion {
    public static void main(String[] args) {
        String s ="abcd";
        permutation(s,0,3);
    }
    public static void permutation(String s ,int st ,int end){
        if(st == end) System.out.println(s);

        for (int i=st;i<= end; i++){
            String s1 = swap(s,st,i);
            permutation(s1,st+1 , end);
        }

    }

    public static String swap(String s,int i ,int j){
        char[] ch = s.toCharArray();
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        return new String(ch);
    }

}

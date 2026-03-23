package org.example;

public class countVowelandConsonatsinString {
    public static void main(String[] args) {
        String s = "aabsggduwvehsgxgubxonqsenuv";
        int v=0;
        int c=0;
        for(char ch : s.toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                v++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                c++;
            }
        }
        System.out.println("vowels = " + v + " Consonants = " + c);

    }
}

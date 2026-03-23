package org.example;

public class StringPalindrome {
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        char[] a = s.toCharArray();
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] != a[j]) {

                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

package org.example;

import java.util.Arrays;

public class zeroShiftRightSide {
    public static void main(String[] args) {
        int[] a = {3,0,9,0,5,0};
        int[] arr = new int[a.length];
        int c = 0;
        for(int n: a){
            if (n != 0) {
                arr[c++] = n;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

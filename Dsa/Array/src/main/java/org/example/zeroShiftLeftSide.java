package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class zeroShiftLeftSide {
    public static void main(String[] args) {
        int[] a = {9,0,3,0,5,0};
        int[] arr = new int[a.length];
        int c = a.length -1;
        for(int n:a){
            if(n != 0){
                arr[c--] = n;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

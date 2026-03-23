package org.example;

import java.util.Arrays;

public class oddNumber {
    //replace odd index with 0
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for(int i=1;i<a.length;i++){
            if(i%2 != 0){
                a[i] = 0;
            }
            //System.out.println(Arrays.toString(a));
        }
        System.out.println(Arrays.toString(a));
    }
}

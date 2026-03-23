package org.example;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a ={1,7,5,3,6,9,7,8};
        selection(a);
        System.out.println(Arrays.toString(a));
    }
    public static void selection(int[] a){
        for(int i=0;i<a.length;i++){
            int midIndex = i;
            for(int j=i+1;j<a.length;j++){
                if(a[j] < a[midIndex]){
                    midIndex = j;
                }
            }
            int temp = a[i];
            a[i] = a[midIndex];
            a[midIndex] = temp;
        }
    }
}

package org.example;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] a = {1,4,5,6,3,6,4,9,8,4,5,7,10};
        bubblesSort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void bubblesSort(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}

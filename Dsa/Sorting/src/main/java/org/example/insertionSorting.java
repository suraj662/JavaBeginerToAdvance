package org.example;


import java.util.Arrays;

public class insertionSorting {
    public static void main(String[] args) {
        int[] a = {6,5,4,3,8,9,1,1};
        Insert(a);
        System.out.println(Arrays.toString(a));
    }
    public static void Insert(int[] a){
        for(int i=1;i<a.length;i++){
            int j= i-1;
            int key = a[i];
            while(j>=0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] =key;
        }
    }
}
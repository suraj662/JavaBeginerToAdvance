package org.example;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a ={1,7,5,3,6,9,7,8};
        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    public static void quickSort(int[] a,int st, int end){
        if(st>end)return;
        int i =st;
        int j= end ;
        int pivot = (st+end)/2;
        while (a[i] < a[pivot]) i++;
        while (a[j] > a[pivot]) j--;
        if(i <= j){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        quickSort(a,st,j);
        quickSort(a,i,end);
    }
}

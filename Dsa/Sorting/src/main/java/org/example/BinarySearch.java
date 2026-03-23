package org.example;

import com.sun.source.tree.BreakTree;

public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {8,4,9,10,12,14,16};
        System.out.println(binary(a,9));

        System.out.println("----------------------");
        int result = BS(a,9,0,a.length-1);
        System.out.println(result);
     }
     public static int binary(int[] a, int key){
        int st =0;
        int end = a.length-1;
        while (st <= end){
            int mid = (st+end)/2;
            if(key == a[mid]) return mid;
            else if(key < a[mid]) return mid-1;
            else st = mid +1;
        }
        return key;
     }

     //using recursion
    public static int BS(int[] a,int key,int st, int end){
        int mid = (st+end)/2;
        if(st > end) return -1;
        if(key == a[mid]){
            return mid;
        }
        else if(key < a[mid]){
            return BS(a,key ,st,mid-1);
        }
        else{
            return BS(a,key,st+1,end);
        }
    }



}

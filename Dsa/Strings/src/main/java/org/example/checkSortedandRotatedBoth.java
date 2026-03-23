package org.example;

public class checkSortedandRotatedBoth {
    public static void main(String[] args) {
        int[] arr1 = {3,4,5,1,2};
        System.out.println(isSortedAndRotated(arr1));
        int[] arr2 = {4,5,1,2,3};
        System.out.println(isSortedAndRotated(arr2));
    }

    public static boolean isSortedAndRotated(int[] arr){
        int n = arr.length;
        int count = 0;
        for (int i=0;i<n;i++){
            //check break in sortef array
            if(arr[i] > arr[(i+1) % n]){
                count++;
            }
        }
        return count <= 1;
    }
}

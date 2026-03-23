package org.example;

public class find1st2ndMaxElement {
    public static void main(String[] args) {
        int[] a = {9,3,1,8,9,2};
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            if(a[i] == max1)continue;
            if(a[i] > max1){
                max2 = max1;
                max1 = a[i];
            }else if(a[i] > max2){
                max2 = a[i];
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}

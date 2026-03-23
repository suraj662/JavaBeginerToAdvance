package org.example;

public class is2ndMinimum {

    public static void main(String[] args) {
        int[] a= {5,3,1,8,9,0,5};
        int min1= Integer.MAX_VALUE;
        int min2= Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]== min1) continue;
            if(a[i] < min1){
                min2= min1;
                min1 = a[i];
            }else if(a[i] < min2){
                min2 = a[i];
            }

        }
        System.out.println(min1);
        System.out.println(min2);

    }
}

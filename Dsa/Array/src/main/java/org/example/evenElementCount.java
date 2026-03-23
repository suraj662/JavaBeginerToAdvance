package org.example;

public class evenElementCount {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int count = 0;
        for(int n:a){
            if(n%2 ==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

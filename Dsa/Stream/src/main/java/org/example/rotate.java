package org.example;

import java.util.Arrays;

public class rotate {
    static void main() {
        int[] a = {2, 3, 4, 5, 6};
        int n = a.length;
        int k = 2;
        int[] temp = new int[n];

        for(int i = 0; i < n; i++) {
            temp[(i+k) % n] = a[i];
        }
        a = temp;
        System.out.println(Arrays.toString(a));
    }
}

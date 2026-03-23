package org.example;

import java.util.Arrays;

public class merge2UnequalArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3, 4, 5, 6};

        int[] temp = new int[a.length + b.length];
        int k = 0;

        // Add all elements of first array
        for (int i = 0; i < a.length; i++) {
            temp[k++] = a[i];
        }

        // Add elements from second array only if not already present
        for (int i = 0; i < b.length; i++) {
            boolean exists = false;

            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                temp[k++] = b[i];
            }
        }

        // Copy only filled elements into final array
        int[] result = Arrays.copyOf(temp, k);

        System.out.println(Arrays.toString(result));
    }
}

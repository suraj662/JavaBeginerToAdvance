package org.example;

public class Max_value {
    public static void main(String[] args) {
        int[] a = {5, 3, 1, 8, 9, 0, 5};
        int max1 =Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        ;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == max1) continue;
            if (a[i] > max1) {
                max2 = max1;
                max1 = a[i];
            } else if (a[i] > max2) {
                max2 = a[i];
            }

        }
        System.out.println("First Max: " + max1);
        System.out.println("Second Max: " + max2);

    }
}

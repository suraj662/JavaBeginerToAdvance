package org.example;

public class MatrixOperations {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] rowSums = getRowSums(arr);
        int[] colSums = getColumnSums(arr);

        printArray("Row Sums", rowSums);
        printArray("Column Sums", colSums);

        int largest = getLargestSum(rowSums, colSums);
        System.out.println("Largest Sum = " + largest);

        int maxRow = getLargestRowSum(arr);
        int maxCol = getLargestColumnSum(arr);

        System.out.println("Largest Row Sum = " + maxRow);
        System.out.println("Largest Column Sum = " + maxCol);
    }

    // 🔹 Row-wise sums
    public static int[] getRowSums(int[][] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            result[i] = sum;
        }

        return result;
    }

    // 🔹 Column-wise sums
    public static int[] getColumnSums(int[][] arr) {
        int[] result = new int[arr[0].length];

        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }

            result[j] = sum;
        }

        return result;
    }

    // 🔹 Print helper
    public static void printArray(String label, int[] arr) {
        System.out.println(label + ":");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + " = " + arr[i]);
        }
    }

    // 🔹 Largest sum
    public static int getLargestSum(int[] rowSums, int[] colSums) {
        int max = Integer.MIN_VALUE;

        for (int val : rowSums) {
            max = Math.max(max, val);
        }

        for (int val : colSums) {
            max = Math.max(max, val);
        }

        return max;
    }

    //largest row sum
    public static int getLargestRowSum(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;

            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }

            max = Math.max(max, sum);
        }

        return max;
    }
    //largest column sum
    public static int getLargestColumnSum(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for (int j = 0; j < arr[0].length; j++) {
            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][j];
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}
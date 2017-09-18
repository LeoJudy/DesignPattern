package util;

import java.util.function.Predicate;

public class Util {


    /**
     * @param arr       the array
     * @param predicate the integer is the index of the arr, true for join the compare
     * @param <T>       the value to compare
     * @return the index of the max value in the array
     */
    public static <T extends Comparable<T>> int getMaxIndex(T[] arr, Predicate<Integer> predicate) {
        if (arr == null) {
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (predicate.test(i) && arr[i].compareTo(arr[maxIndex]) > 0) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static <T extends Comparable<T>> int getMinIndex(T[] arr) {
        if (arr == null) {
            return -1;
        }
        int minIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[minIndex]) < 0) {
                minIndex = i;
            }
        }
        return minIndex;
    }


    public static int getMaxIndex(int[] arr) {
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    public static int getMaxValue(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] arr_h : arr) {
            for (int a : arr_h) {
                if (max < a) {
                    max = a;
                }
            }
        }
        return max;
    }

    public static void showArr(char[] arr) {
        for (char a : arr) {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void showNull() {
        System.out.println("null");
    }

    public static void showArr(char[][] arr) {
        for (char[] a : arr) {
            showArr(a);
        }
    }

    public static void showArr(int[] arr) {
        for (int a : arr) {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void showArr(long[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void showArr(long[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            showArr(arr[i]);
        }
    }

    public static void showLine() {
        System.out.println("-----------------------------------------------------------------------------------------");
    }
}

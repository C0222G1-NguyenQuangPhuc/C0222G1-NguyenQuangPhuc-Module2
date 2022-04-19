package _14_sorting_algorithm.exercise;

import java.util.Arrays;

public class InsertionSort {
    static int[] arr = {4, 7, 5, 6, 8, 9};

    public static void main(String[] args) {
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arg) {
        for (int i = 1; i < arg.length; i++) {
            int currentElement = arg[i];
            int j;
            for (j = i - 1; j >= 0 && arg[j] > currentElement; j--) {
                arg[j + 1] = arg[j];
            }
            arg[j + 1] = currentElement;
        }
    }
}

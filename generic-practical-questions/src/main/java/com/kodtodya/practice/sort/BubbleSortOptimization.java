package com.kodtodya.practice.sort;

import java.util.Arrays;

public class BubbleSortOptimization {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        optimizedBubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were swapped in inner loop, array is already sorted
            if (!swapped) break;
        }
    }
}
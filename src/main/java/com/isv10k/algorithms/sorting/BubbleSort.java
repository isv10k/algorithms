package com.isv10k.algorithms.sorting;

import com.isv10k.algorithms.SortingAlgorithm;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort(int[] array) {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

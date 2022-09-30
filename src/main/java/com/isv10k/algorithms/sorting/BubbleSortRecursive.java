package com.isv10k.algorithms.sorting;

import com.isv10k.algorithms.SortingAlgorithm;

public class BubbleSortRecursive implements SortingAlgorithm {
    private void recSort(int[] array, int len) {
        if (len == 1) {
            return;
        }
        boolean swapped = false;
        for (int i = 0; i < len - 1; i++) {
            if (array[i] > array[i + 1]){
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                swapped = true;
            }
        }
        if (swapped) {
            recSort(array, len - 1);
        }
    }

    public void sort(int[] array) {
        recSort(array, array.length);
    }
}

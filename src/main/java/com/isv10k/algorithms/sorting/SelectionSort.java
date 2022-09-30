package com.isv10k.algorithms.sorting;

import com.isv10k.algorithms.SortingAlgorithm;

public class SelectionSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = tmp;
        }
    }
}

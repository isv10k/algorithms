package com.isv10k.algorithms.sorting;

import com.isv10k.algorithms.SortingAlgorithm;

public class SelectionSortRecursive implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        sSort(array, 0, array.length - 1);
    }

    private void sSort(int[] array, int low, int high) {
        if (low < high) {
            int minIndex = low;
            for (int i = low + 1; i <= high; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
            }
            int tmp = array[minIndex];
            array[minIndex] = array[low];
            array[low] = tmp;

            sSort(array, low + 1, high);
        }
    }

}

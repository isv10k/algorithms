package com.isv10k.algorithms.sorting;

import com.isv10k.algorithms.SortingAlgorithm;

public class QuickSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int pivot = array[0];
        int[] less;
        int[] greater;

    }
}

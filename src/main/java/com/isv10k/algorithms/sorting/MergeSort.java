package com.isv10k.algorithms.sorting;

import com.isv10k.algorithms.SortingAlgorithm;

public class MergeSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        mSort(array, 0, array.length - 1);
    }

    private void mSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            mSort(array, low, mid);
            mSort(array, mid + 1, high);
            merge(array, low, mid, high);
        }
    }

    // 2    5    7    [10]|    1    4    9
    // l               mid               h
    private void merge(int[] array, int low, int mid, int high) {
        int[] leftArray = new int[mid - low + 1];
        int[] rightArray = new int[high - mid];

        for (int i = 0; i < leftArray.length; i++) {
            leftArray[i] = array[low + i];
        }
        for (int i = 0; i < rightArray.length; i++) {
            rightArray[i] = array[mid + 1 + i];
        }

        int li = 0;
        int ri = 0;
        int k = low;
        while (li < leftArray.length && ri < rightArray.length) {
            if (leftArray[li] <= rightArray[ri]) {
                array[k] = leftArray[li];
                li++;
            } else {
                array[k] = rightArray[ri];
                ri++;
            }
            k++;
        }
        while (li < leftArray.length) {
            array[k] = leftArray[li];
            li++;
            k++;
        }
        while (ri < rightArray.length) {
            array[k] = rightArray[ri];
            ri++;
            k++;
        }
    }
}

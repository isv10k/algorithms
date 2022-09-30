package com.isv10k.algorithms.sorting;

import com.isv10k.algorithms.SortingAlgorithm;

public class QuickSort implements SortingAlgorithm {

    @Override
    public void sort(int[] array) {
        qSort(array, 0, array.length - 1);
    }

    /* The main function that implements QuickSort
    arr[] --> Array to be sorted,
    low --> Starting index,
    high --> Ending index */
    private void qSort(int[] array, int low, int high)
    {
        if (low < high) { // if not then array.length is less than 2

            /* pi is partitioning index, array[pi] is
            now at right place */
            int pi = partition(array, low, high);

            // Recursively sort elements before
            // partition and after partition
            qSort(array, low, pi - 1);
            qSort(array, pi + 1, high);
        }
    }

    /* This function takes last element as pivot,
    places the pivot element at its correct
    position in sorted array, and places all
    smaller (smaller than pivot) to left of
    pivot and all greater elements to right
    of pivot */
    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1; // index last of smaller than pivot element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (array[j] <= pivot) {
                i++; // Move index, to place there next smaller than pivot element

                // swap array[i] and array[j]
                // array[j] element which needs to be placed near all elements smaller than pivot
                // array[i] at this point is the closest element to all elements smaller than pivot
                if (i != j) { // if i == j then all passed elements were smaller than pivot, so no need for swap
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        // After loop, we sit on array where all elements from low to i are lower or equal to array[high](pivot)
        // so we need to swap array[i+1] element with array[high](pivot) to place pivot between
        // lower and higher values

        // swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return new index of pivot
        return i + 1;
    }
}

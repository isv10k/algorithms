package com.isv10k.algorithms;

import com.isv10k.algorithms.sorting.BubbleSort;
import com.isv10k.algorithms.sorting.BubbleSortRecursive;
import com.isv10k.algorithms.sorting.SelectionSort;

import java.util.Arrays;

import static com.isv10k.algorithms.util.Arrays.generateRandomArrayOfSize;
import static com.isv10k.algorithms.util.Arrays.isSorted;

public class Main {
    public static void main(String[] args) {

        SortingAlgorithm bubbleSort = new BubbleSort();
        SortingAlgorithm bubbleSortRecursive = new BubbleSortRecursive();
        SortingAlgorithm selectionSort = new SelectionSort();

        checkAlgorithm(selectionSort);


    }

    public static void checkAlgorithm(SortingAlgorithm alg) {
        int[] array = generateRandomArrayOfSize(10);
        alg.sort(array);

        if (isSorted(array)) {
            System.out.println("Sorted");
        } else {
            System.out.println("Sorting failed");
            System.out.println(Arrays.toString(array));
        }
    }
}

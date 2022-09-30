package com.isv10k.algorithms;

import com.isv10k.algorithms.sorting.*;

import java.util.Arrays;

import static com.isv10k.algorithms.util.Arrays.generateRandomArray;
import static com.isv10k.algorithms.util.Arrays.isSorted;

public class Main {
    public static void main(String[] args) {

        SortingAlgorithm bubbleSort = new BubbleSort();
        SortingAlgorithm bubbleSortRecursive = new BubbleSortRecursive();
        SortingAlgorithm selectionSort = new SelectionSort();
        SortingAlgorithm insertionSort = new InsertionSort();
        SortingAlgorithm quickSort = new QuickSort();

        checkAlgorithm(quickSort);


    }

    public static void checkAlgorithm(SortingAlgorithm alg) {
        int[] array = generateRandomArray(10, 0, 101);

        System.out.println("Before sort:");
        System.out.println(Arrays.toString(array));

        alg.sort(array);

        if (isSorted(array)) {
            System.out.println("Sorted");
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Sorting failed");
            System.out.println(Arrays.toString(array));
        }
    }
}

package com.isv10k.algorithms.util;

import java.util.Random;

public class Arrays {
    public static int[] generateRandomArray(int size, int origin, int bound) {
        Random random = new Random();
        int[] randomArray = new int[size];

        for (int i = 0; i < size; i++) {
            randomArray[i] = random.nextInt(origin, bound);
        }
        return randomArray;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] < array[i]) {
                return false;
            }
        }
        return true;
    }
}

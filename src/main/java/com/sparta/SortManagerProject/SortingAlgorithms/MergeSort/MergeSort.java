package com.sparta.SortManagerProject.SortingAlgorithms.MergeSort;

import com.sparta.SortManagerProject.SortingAlgorithms.SortChosen;

public class MergeSort implements SortChosen {

    public int[] sortArray(int[] unsortedArray){
        return splitMergeSort(unsortedArray);
    }

    public static int[] splitMergeSort(int[] arrayIn) {
        int midPoint = (arrayIn.length / 2);
        int[] splitArray1 = new int[midPoint];
        int[] splitArray2 = new int[midPoint];
        int k = 0;
        if (arrayIn.length == 1) {
            return arrayIn;
        } else {
            for (int i = 0; i <= midPoint - 1; i++) {
                splitArray1[i] = arrayIn[i];
            }
            for (int j = midPoint; j <= arrayIn.length - 1; j++) {
                splitArray2[k] = arrayIn[j];
                k++;
            }
            splitMergeSort((splitArray1));
            splitMergeSort(splitArray2);
        }
        return mergeSortArrays(arrayIn, splitArray1, splitArray2);
    }

    public static int[] mergeSortArrays(int[] originalUnsortedArray, int[] array1, int[] array2) {
        int array1Count = 0;
        int array2Count = 0;
        int mergeArrayCount = 0;
        while (array1Count < array1.length && array2Count < array2.length) {
            if (array1[array1Count] < array2[array2Count]) {
                originalUnsortedArray[mergeArrayCount] = array1[array1Count];
                array1Count++;
            } else {
                originalUnsortedArray[mergeArrayCount] = array2[array2Count];
                array2Count++;
            }
            mergeArrayCount++;
        }
        while (array1Count < array1.length) {
            originalUnsortedArray[mergeArrayCount] = array1[array1Count];
            array1Count++;
            mergeArrayCount++;
        }
        while (array2Count < array2.length) {
            originalUnsortedArray[mergeArrayCount] = array2[array2Count];
            array2Count++;
            mergeArrayCount++;
        }
        return originalUnsortedArray;
    }

}

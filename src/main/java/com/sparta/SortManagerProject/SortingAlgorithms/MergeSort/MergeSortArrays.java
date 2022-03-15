package com.sparta.SortManagerProject.SortingAlgorithms.MergeSort;

public class MergeSortArrays {
    public static int[] mergeSortArrays(int[] originalUnsortedArray, int[] array1, int[] array2){
        int array1Count = 0;
        int array2Count = 0;
        int mergeArrayCount = 0;
        while (array1Count < array1.length && array2Count < array2.length){
            if (array1[array1Count] < array2[array2Count]){
                originalUnsortedArray[mergeArrayCount] = array1[array1Count];
                array1Count ++;
            } else {
                originalUnsortedArray[mergeArrayCount] = array2[array2Count];
                array2Count ++;
            }
            mergeArrayCount++;}
        while (array1Count < array1.length){
            originalUnsortedArray[mergeArrayCount] = array1[array1Count];
            array1Count ++;
            mergeArrayCount++;
        }
        while (array2Count < array2.length){
            originalUnsortedArray[mergeArrayCount] = array2[array2Count];
            array2Count ++;
            mergeArrayCount ++;
        }
        return originalUnsortedArray;}
}

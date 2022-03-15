package com.sparta.SortManagerProject.SortingAlgorithms.MergeSort;

public class MergeSort {
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
        return MergeSortArrays.mergeSortArrays(arrayIn, splitArray1, splitArray2);}
}

package com.sparta.SortManagerProject.SortingAlgorithms.BubbleSort;

public class BubbleSort {

    public static int[] bubbleSort(int[] newArray){

        for (int num = 0; num < newArray.length - 1; num++) {
            for (int num2 = 0; num2 < newArray.length - num - 1; num2++)
                if (newArray[num2] > newArray[num2 + 1]) {
                    swap(newArray, num2);
                }
        }
        return newArray; }

    private static void swap(int[] newArray, int num2) {
        newArray[num2] += newArray[num2 + 1];
        newArray[num2 + 1] = newArray[num2] - newArray[num2 + 1];
        newArray[num2] -= newArray[num2 + 1];
    }
}

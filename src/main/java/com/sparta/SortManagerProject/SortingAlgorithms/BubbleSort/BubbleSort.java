package com.sparta.SortManagerProject.SortingAlgorithms.BubbleSort;

import com.sparta.SortManagerProject.SortingAlgorithms.SortChosen;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BubbleSort implements SortChosen {
    private static Logger bubbleSortLogger = Logger.getLogger("bubbleSortLogger");

    public int[] sortArray(int[] unsortedArray){
        return bubbleSort(unsortedArray);
    }

    public static int[] bubbleSort(int[] newArray){
        bubbleSortLogger.log(Level.INFO, "Start of Bubble sort method");
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

package com.sparta.SortManagerProject.controller;

import com.sparta.SortManagerProject.SortingAlgorithms.BinaryTreeSort.BinarySort;
import com.sparta.SortManagerProject.SortingAlgorithms.BubbleSort.BubbleSort;
import com.sparta.SortManagerProject.SortingAlgorithms.MergeSort.MergeSort;
import com.sparta.SortManagerProject.SortingAlgorithms.SortChosen;

public class SortChooser {

    public static SortChosen getSorter(int choice) {
        switch (choice) {
            case 1:
                return new BinarySort();
            case 2:
                return new MergeSort();
            case 3:
                return new BubbleSort();
        }
    }
}

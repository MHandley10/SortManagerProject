package com.sparta.SortManagerProject.SortingAlgorithms.BinaryTreeSort;

import com.sparta.SortManagerProject.SortingAlgorithms.SortChosen;

public class BinarySort implements SortChosen {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        return new int[0];
    }

    @Override
    public int[] sortArray(int[] unsortedArray, int rootNode){
        int[] sortedArray = new int[unsortedArray.length];
        sortedArray = binarySort(unsortedArray, rootNode);
        return sortedArray;
    }

    private static int[] binarySort(int[] unsortedArray) {
        int[] sortedArray = new int[unsortedArray.length];
        BinaryTreeSort unsortedArrayTree = new BinaryTreeSort(rootNode);
        int unsortedArrayCounter = 0;
        for (int element : unsortedArray){
            unsortedArrayTree.addElement(unsortedArray[unsortedArrayCounter]);
        unsortedArrayCounter++;
        }
        for (int i = 0; i < sortedArray.length; i++)
        sortedArray = unsortedArrayTree.sortTree(rootNode, , 0);
        return sortedArray;
    }
}

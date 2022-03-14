package com.sparta.SortManagerProject.Main;

import com.sparta.SortManagerProject.SortingAlgorithms.BinaryTreeSort;


public class Main {
    public static void main(String[] args) {
        BinaryTreeSort tree = new BinaryTreeSort(5);
            tree.addElement(11);
            tree.addElement(12);
            tree.addElement(13);
            tree.addElement(14);
            tree.addElement(15);
            tree.addElement(16);
        ;
        System.out.println(tree.findElement(13));   }
}

package com.sparta.SortManagerProject.Interactable;

import java.util.Random;

public class ArrayGenerator {
    public static int[] arrayGenerator(int arraySize){
    int[] generatedArray = new int[arraySize];
    int indexCounter = 0;
    for (int i = 0; i < arraySize; i++){
        Random random = new Random();
        generatedArray[indexCounter] = random.nextInt(-1000,1001);
        indexCounter++;
    }
    return generatedArray;}
}

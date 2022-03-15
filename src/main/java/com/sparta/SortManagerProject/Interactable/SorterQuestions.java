package com.sparta.SortManagerProject.Interactable;


import java.util.Scanner;

public class SorterQuestions {

    Scanner sortQuestion = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Your sort method options are:");
        System.out.println("1. Bubble sort");
        System.out.println("2. Binary tree sort");
        System.out.println("3. Merge sort");
        System.out.print("Which sort method would you like to choose (please enter the number associated with that method) ");
        int sortMethod = scanner.nextInt();
        System.out.println("You chose " );
    }
}

package Sorting;

import java.util.*;

public class BubbleSorting1 {

    public static void bubbleSortAlgorithm(int arr[]) {
        // outerLoop
        for (int turn = 0; turn < arr.length - 1; turn++) {
            // innerLoop
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 2, 3 };
        bubbleSortAlgorithm(arr);
        printArr(arr);
    }
}

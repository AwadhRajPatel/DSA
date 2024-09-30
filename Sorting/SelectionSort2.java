package Sorting;

import java.util.*;

public class SelectionSort2 {

    public static void selectionSortAlgorithm(int arr[]){
        for(int i =0; i<arr.length-1; i++){
          int minPos =i;
          for(int j=i+1; j<arr.length; j++){
            if (arr[minPos] > arr[j]) {  // arr[minpos]<arr[j] in this case show the decreasing order
                minPos = j;
            }
          }  

          //swaping in outer Loop
          int temp = arr[minPos];
          arr[minPos] = arr[i];
          arr[i] = temp;
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selectionSortAlgorithm(arr);
        printArr(arr);

    }
}

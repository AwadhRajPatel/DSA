package DIVIDEANDCONQUER;

public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Quicksort(int arr[], int startidx, int endidx) {
        // base-case
        if (startidx >= endidx) {
            return;
        }
        // last element
        int pIdx = partition(arr, startidx, endidx);
        Quicksort(arr, startidx, pIdx - 1); // left
        Quicksort(arr, pIdx + 1, endidx); // Right

    }

    public static int partition(int arr[], int startidx, int endidx) {
        int pivot = arr[endidx];
        int i = startidx - 1; // to make place for elment samller than pivot

        for (int j = startidx; j < endidx; j++) {
            if (arr[j] <= pivot) {
                i++;

                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        // swap
        int temp = pivot;
        arr[endidx] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        Quicksort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

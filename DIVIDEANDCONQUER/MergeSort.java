package DIVIDEANDCONQUER;

public class MergeSort {

    public static void printArr(int arr[]){   // Print function 
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int startidx, int endidx){ // Recursion function
        // base-case
        if (startidx >= endidx) {
            return;
        }
        // kaam
        int mid = startidx + (endidx - startidx)/2;   // (si +ei)/2
        mergesort(arr, startidx, mid); //left part
        mergesort(arr, mid + 1, endidx);  // right part
        merge(arr,startidx,mid,endidx);
    }

    public static void merge(int arr[], int startidx, int mid, int endidx){  // MergeShort function
        // left(0 3) =4 right(4,6) =3
        int temp[] = new int[endidx - startidx +1];  // important line

        int i = startidx; //iterator for left part
        int j = mid +1; //iterator for Right part
        int k = 0;      //iterator for temp part

        while (i <= mid && j <= endidx) {
             if (arr[i] < arr [j]) {
                temp[k] = arr[i];
                i++; 
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // Right part
        while (j <= endidx) {
            temp[k++] = arr[j++];
        }

        // Copy temp to  original arr
        for(k = 0, i=startidx; k < temp.length; k++, i++){
            arr[i] = temp[k];
        }

    }
    
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }
}

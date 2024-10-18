package DIVIDEANDCONQUER;

public class RotatedSorted {
    public static int Search(int arr[], int tar,int startidx, int endidx){
        // base-case
             if (startidx > endidx) {
                return -1;
             }
             
        // kaam
        int mid  = startidx +(endidx-startidx)/2;
        // case Found
        if (arr[mid] == tar) {
            return mid;
        }

        // mid on L1
        if (arr[startidx] <= arr[mid]) {
            // case a left
            if (arr[startidx]<= tar && tar <= arr[mid]) {
               return Search(arr, tar, startidx, mid);
            }else{
                // case b: right
                return Search(arr, tar, mid+1, endidx);
            }
        }
        // mid on L2
        else{
            // case -C right
            if (arr[mid] <= tar && tar <= arr[endidx]) {
                return Search(arr, tar, mid+1, endidx);
            }else{
                // case D left
                return Search(arr, tar, startidx, mid-1);
            }

        }

    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target =0;

        int tarIdx = Search(arr, target, 0, arr.length-1);
        System.out.println(tarIdx);
    }
}

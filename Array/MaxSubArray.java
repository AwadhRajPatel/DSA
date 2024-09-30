import java.util.*;

public class MaxSubArray {
public static void maxsubarray(int numbers[]) {
    int currSum =0;
    int maxSum = Integer.MIN_VALUE;

    for(int i=0; i<numbers.length;i++){
        int start =i;
        for(int j=i;j<numbers.length; j++){
            int end =j;
            currSum =0;
            for(int k=start;k<=end;k++){
            // SubARRay Sum
            currSum += numbers[k]; 
            }
            System.out.println(currSum);
            if (maxSum<currSum) {
                maxSum = currSum;
            }
        }
    }
    System.out.println("Total Number of Max-SubArraySum = : " + maxSum);
}
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxsubarray(numbers);
    }
}

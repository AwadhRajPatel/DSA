package GREEDYALGORITHM;

import java.util.Arrays;

public class MiniAbsolute {
    public static void main(String[] args) {
        int A[] ={1,2,3};
        int B[] ={2,1,3};

        Arrays.sort(A);
        Arrays.sort(B);
        
        int miniDifference =0;

        for(int i=0; i<A.length; i++){
            miniDifference += Math.abs(A[i] - B[i]);
        }

        System.out.println("Minimum Absolute diff of pairs = " + miniDifference);
    }
} 

import java.util.*;

public class SubArrays {
    public static void PrintSubArray(int numbers[]) {
        int TotalSubArr = 0;

        // outerLoop
        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            // innerLoop
            for (int j = i; j < numbers.length; j++) {
                int end = j;

                // finalLoop
                for (int k = start; k <= end; k++) { // print karvana
                    System.out.print(numbers[k] + " "); // subArray
                }
                TotalSubArr++;

                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total SubArray = : " + TotalSubArr);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        PrintSubArray(numbers);
    }
}

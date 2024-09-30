import java.util.*;

public class KADANEALGO {
    public static void KadanesAlgorithm(int numbers[]) {
        int maximumSum = Integer.MIN_VALUE;
        int CurrentSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            CurrentSum = CurrentSum + numbers[i];
            if (CurrentSum < 0) {
                CurrentSum = 0;
            }
            maximumSum = Math.max(CurrentSum, maximumSum);
        }
        System.out.println("Our maximum SubArray sum of Kadanes = : " + maximumSum);
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        KadanesAlgorithm(numbers);
    }
}

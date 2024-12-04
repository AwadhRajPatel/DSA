package GREEDYALGORITHM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivityGreedy {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        // Sorting 
         int activities[][] = new int [start.length][3];
         for(int i =0; i<start.length; i++){
            activities[1][0] =i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
         }
        
        //  This lambda function -> shortform 
         Arrays.sort(activities,Comparator.comparingDouble(o -> o[2]));

        // end time basis sorted
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st Activity
        maxAct = 1;

        //  Shorting concept
            ans.add(activities[0][0]);
            int lastEnd = activities[0][2];
            for(int i=1; i<end.length;i++){
                if (activities[i][1] >= lastEnd) {
                    maxAct++;
                    ans.add(activities[i][0]);
                    lastEnd = activities[i][2];
                }
            }

        // Sorted Array Phale se diya gaya hai
        // ans.add(0);
        // int lastEnd = end[0];

        // for (int i = 1; i < end.length; i++) {
        //     if (start[i] >= lastEnd) {
        //         // Activity Select
        //         maxAct++;
        //         ans.add(i);
        //         lastEnd = end[i];
        //     }
        // }

        System.out.println("Max Activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}

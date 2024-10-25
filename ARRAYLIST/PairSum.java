package ARRAYLIST;

import java.util.ArrayList;

public class PairSum {
    // brute Force
    // public static boolean pairSum1(ArrayList<Integer> list, int target){
    // for(int i =0; i<list.size(); i++){
    // for(int j = i+1; j<list.size(); j++){
    // if (list.get(i) + list.get(j) == target) {
    // return true;
    // }
    // }
    // }
    // return false;
    // }

    // 2 Pointer Approach
    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp != rp) {
            // case1
            if (list.get(lp) + list.get(rp) == target) {
                return true;
            } else if (list.get(lp) + list.get(rp) < target) { // this Second Case-2
                lp++;
            } else { // In this third Case-3
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;
        System.out.println(pairSum1(list, target));
    }
}

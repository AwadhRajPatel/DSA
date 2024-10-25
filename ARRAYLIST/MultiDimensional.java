package ARRAYLIST;

import java.util.ArrayList;

public class MultiDimensional {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        // Adding elements to list1
        for (int i = 1; i <= 5; i++) {
            list1.add(i * 1);
        }

        // Adding elements to list2
        for (int i = 1; i <= 5; i++) { 
            list2.add(i * 2);
        }

        // Adding elements to list3
        for (int i = 1; i <= 5; i++) {
            list3.add(i * 3);
        }

        // Adding all lists to the mainList
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        // Printing the mainList
        System.out.println(mainList);

        // Nested Loop 
        for(int i = 0; i<mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j =0; j<currList.size(); j++){
                System.err.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}

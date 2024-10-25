package ARRAYLIST;

import java.util.ArrayList;

public class BasicArrayLs {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();
        // add
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // list.add(1, 9);
        
        System.out.println(list);

        // Get Operation
        int element = list.get(2);
        // System.out.println(element);

        // Remove Element
        list.remove(2);
        System.err.println(list);

        // Set Element
        list.set(2, 10);
        System.out.println(list);

        // Contains Elements
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
    }
}

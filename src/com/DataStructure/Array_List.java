package com.DataStructure;
import java.util.ArrayList;
import java.util.Collections;

public class Array_List {
    public static void main (String[]args){
        ArrayList<Integer> list = new ArrayList<>();
        // ADD

        list.add(5);  // Here 5 is value
        list.add(2);
        list.add(4);

        System.out.println(list);

        // GET

        int element = list.get(1);  // Here 1 is indexed
        System.out.println(element);

        // ADD IN BETWEEN

        list.add(1, 1);
        System.out.println(list);

        // CHANGE ELEMENT VALUE

        list.set(3, 3);   // Here first(3) is index and second(3) is value.
        System.out.println(list);

        // REMOVE

        list.remove(3);  // Here 3 is index.
        System.out.println(list);

        // SIZE

        System.out.println("Size of list is " + list.size());

        // PRINT BY LOOPS

        for (Integer i : list) {
            System.out.print(i);
        }
        System.out.println();

        // SORTING

        Collections.sort(list);
        System.out.println(list);

    }
}

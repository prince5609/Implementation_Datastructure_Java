package com.DataStructure;

public class Selection_Sort {
    public static int[] selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++){
            int anchor = i;
            int smallest = arr[anchor];
            int smallest_index = anchor;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < smallest){
                    smallest = arr[j];
                    smallest_index = j;
                }
            }
            if (anchor != smallest_index){
            swap(arr,anchor, smallest_index);
            }
        }
        return arr;
    }

    public static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args){
        int [] arr = {55, 33, 9, 41, 6, 1, 7, 2, 5, 879, 5, 5, 4, 85, 5646, 2585, 5564};
        selection_sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

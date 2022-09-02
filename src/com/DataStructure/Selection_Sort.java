package com.DataStructure;

public class Selection_Sort {
    public static int[] selection_sort(int[]arr){
        for (int i = 0; i < arr.length; i++){
            int smallest = arr[i];
            int smallest_index = i;
            int j = i + 1;
            while (j < arr.length){
                if (arr[j] < smallest){
                    smallest = arr[j];
                    smallest_index = j;
                }
                j++;
            }
            swap (arr, smallest_index, i);
        }
        return arr;
    }

    public static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String[] args){
        int[] arr = {55, 33, 9, 41, 6, 1, 7, 2, 5, 879, 5, 5, 4, 85, 5646, 2585, 5564};
        selection_sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
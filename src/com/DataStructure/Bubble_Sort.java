package com.DataStructure;

public class Bubble_Sort {
    public static void bubble_sort(int []arr){
        for ( int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+ 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    public static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String [] args){
        int [] arr = {9, 12, 7, 25, 12, 69, 3, 45};
        bubble_sort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

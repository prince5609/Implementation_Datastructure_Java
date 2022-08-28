package com.DataStructure;

public class Bubble_Sort {
    public static int[] bubble_sort(int []arr){
        for (int i = 0; i < arr.length -1 ; i++){
            if (arr[i] > arr[i + 1]){
                swap(arr, i, i+ 1);
            }
        }
        return arr;
    }
    public static void swap(int[]arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String [] args){
        int [] arr = {9, 3, 7, 25, 12, 69, 45};
        bubble_sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print( arr[i] + " ");
        }
    }
}

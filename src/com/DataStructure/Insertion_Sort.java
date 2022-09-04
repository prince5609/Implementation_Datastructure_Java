package com.DataStructure;

public class Insertion_Sort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length;i++){
            int j = i -1;
            int anchor = arr[i];
            while (j >= 0 && anchor < arr[j]){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = anchor;
        }
    }
    public static void main(String [] args){
        int [] arr = {21, 29, 38, 17, 4, 25, 11, 32, 9};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

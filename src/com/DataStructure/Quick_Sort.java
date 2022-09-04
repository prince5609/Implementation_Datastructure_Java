package com.DataStructure;

public class Quick_Sort{
    public static void swap(int[] arr, int a, int b){
        if (a != b){
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
    }
    public static int partition(int[] arr, int start, int end){
        int pivot_index = start;
        int pivot = arr[pivot_index];
        while(start <  end){
            while (start < arr.length && arr[start] <= pivot){
                start++;
            }
            while (arr[end] > pivot){
                end--;
            }
            if (start < end){
                swap(arr, start, end);
            }
        }
        swap(arr, pivot_index, end);
        return end;
    }
    public static void quickSort(int[] arr, int start, int end){
        if (start < end){
            int pi = partition(arr, start, end);
            quickSort(arr, start, pi - 1);
            quickSort(arr, pi + 1, end);
        }
    }
    public static void main(String [] args){
        int [] arr = {11, 9, 7, 29, 2, 28};
        quickSort(arr,0,arr.length - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

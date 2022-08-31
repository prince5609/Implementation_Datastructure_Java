package com.DataStructure;

public class Merge_Sort {
    public static void divide(int []arr , int si, int ei){
        if (si >= ei){
            return;
        }
        int mid = si + (ei - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(int[]arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;
        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[x] = arr[index1];
                index1++;
            } else {
                merged[x] = arr[index2];
                index2++;
            }
            x++;
        }
        while (index1 <= mid) {
            merged[x] = arr[index1];
            index1++;
            x++;
        }
        while (index2 <= ei) {
            merged[x] = arr[index2];
            index2++;
            x++;
        }
        int j = si;
        for (int i = 0; i < merged.length; i++){
            arr[j] = merged[i];
            j++;
        }
    }

    public static void main(String[]args){
        int [] arr = {6, 3, 9, 5, 2, 8};
        divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

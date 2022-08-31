package com.DataStructure;

public class Shell_sort {
    public static int[]  shell_sort(int[]arr){
        int n = arr.length;
        int gap = n / 2;
        while (gap > 0){
            for (int i = gap; i < n; i++){
                int anchor = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > anchor){
                    arr[j] = arr[j - gap];
                    j = j - gap;
                    arr[j] = anchor;
                }
            }
            gap = gap / 2;
        }
        return arr;
    }

    public static void main(String[] args){
        int []arr = {21, 38, 29, 17, 4, 25, 11, 32, 9};
        int [] arr1 = {1, 2, 3, 4, 5, -6};
        shell_sort(arr);
        for (int i = 0; i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        shell_sort(arr1);
        for (int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i] + " ");
        }
    }
}

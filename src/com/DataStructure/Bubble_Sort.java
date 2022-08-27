package com.DataStructure;

public class Bubble_Sort {
    public static void main(String[] args) {
        int [] a = {9,3,7,25,12,69,45};
        for (int i = 0; i < a.length - 1; i++){
            if(a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+ 1];
                a[i+1] = temp;
            }
        }
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
}

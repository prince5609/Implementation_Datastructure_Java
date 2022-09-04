package com.DataStructure;

public class Arrays_1D{
    public static void main(String[] args){
        int [] a1 = new int [5];
        int num = 1;
        for (int i = 0; i < a1.length; i++){
            a1[i] = num;
            num = num + 2;
        }
        for (int i : a1) {
            System.out.print(i + " ");
        }

    }
}
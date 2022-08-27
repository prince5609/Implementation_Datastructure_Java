package com.DataStructure;

public class Arrays_2D {
    public static void main(String[] args){
        int [][] a1 = new int[4][3];
        int num = 1;
        for (int i = 0; i < a1[1].length; i++){
            for ( int j = 0; j < a1[0].length; j++){
                a1[i][j] = num;
                num = num + 2;
            }
        }
        for (int k = 0; k < a1[1].length; k++){
            for (int l = 0; l < a1[0].length; l++){
                System.out.print(a1[k][l] + " ");
            }
            System.out.println();
        }
    }
}
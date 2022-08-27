package com.DataStructure;
import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("Which number do you want to search in array? ");
        int number = sc.nextInt();
        int count = 1;
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] == number) {
                System.out.println("Yes" + number + " is available at index " + i);
                break;
            }
            else
                count++;
        }
        if (count > a1.length){
            System.out.println("Sorry that number doesn't exist in this array");
        }
    }
}
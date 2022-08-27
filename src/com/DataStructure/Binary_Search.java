package com.DataStructure;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String [] args){
        int[] a = new int[]{0, 1, 4, 6, 8, 10, 43, 67};
        Scanner sc = new Scanner(System.in);
        System.out.println("which number do you want to search? ");
        int number = sc.nextInt();
        int length = a.length;
        int li = 0;
        int hi = length - 1;
        int mi = (li + hi) / 2;
        while (li <= hi) {
            if (a[mi] == number) {
                System.out.println(number + " is available in array at index " + mi);
                break;
            }
            else if (a[li] == number){
                System.out.println(number + " is available in array at index " + li);
                break;
            }
            else if (a[hi] == number) {
                System.out.println(number + " is available in array at index " + hi);
                break;
            }
            else if (a[mi] < number) {
                li = mi + 1;
                mi = (hi + li) / 2;
            }
            else if ( a[mi] > number){
                hi = mi - 1;
                mi = (hi + li) / 2;
            }
        }
    }
}

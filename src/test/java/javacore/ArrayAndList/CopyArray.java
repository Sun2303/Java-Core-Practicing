package javacore.ArrayAndList;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrCopy = new int[10];
        System.out.println("The original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe clone array: ");
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = arr[i];
            System.out.print(arrCopy[i] + " ");
        }
    }
}

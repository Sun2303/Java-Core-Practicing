package javacore.ArrayAndList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the size of the array: ");
        int arrayNumber = input.nextInt();
        int[] arr = new int[arrayNumber];
        int[] arrCopy = new int[arrayNumber];
        System.out.println("Please input the number correspond to the amount: ");
        for(int i=0; i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("The original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            arrCopy[i] = arr[i];
        }
        System.out.println("\nThe clone array: ");
        for (int i = 0; i < arrCopy.length; i++) {
            System.out.print(arrCopy[i] + " ");
        }

    }
}

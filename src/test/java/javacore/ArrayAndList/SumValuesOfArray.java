package javacore.ArrayAndList;

import java.util.Arrays;
import java.util.Scanner;

public class SumValuesOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++){
            System.out.println("Please input number "+ i + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.stream(arr).sum());
    }
}

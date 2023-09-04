package javacore.ArrayAndList;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int[] order = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int num = input.nextInt();
        for (int i = 0; i < order.length; i++) {
            int time = num * order[i];
            System.out.println(num + " * " + order[i] + " = " + time);
        }
    }
}

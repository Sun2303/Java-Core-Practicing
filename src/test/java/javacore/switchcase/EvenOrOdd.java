package javacore.switchcase;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //Write a program to Check whether the number is even or odd using switch statement
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a number: ");
        num = input.nextInt();
        switch (num % 2) {
            case 0:
                System.out.println("This is an even number!");
                break;
            case 1:
                System.out.println("This is an odd number!");
                break;
        }
    }
}

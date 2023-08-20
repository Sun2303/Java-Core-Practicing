package javacore.switchcase;

import java.util.Scanner;

public class NumberOfDayInAMonth {
    public static void main(String[] args) {
        //Write a program to Find the number of days in a month using a switch statement
        Scanner input = new Scanner(System.in);
        int month;
        System.out.print("Please input a month to check the number of days: ");
        month = input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days!");
                break;
            case 2:
                System.out.println("This month has 28 days!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days!");
                break;
            default:
                System.out.println("Invalid month!");
                break;
        }
    }
}

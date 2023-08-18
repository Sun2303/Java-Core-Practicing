package javacore.switchcase;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        //1. Write a program to read a weekday number and print weekday name using switch statement
        Scanner input = new Scanner(System.in);
        int day = 1;
        System.out.println("Please the weekday number: ");
        day = input.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The invalid value!");
        }
    }

}

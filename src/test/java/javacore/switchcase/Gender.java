package javacore.switchcase;

import java.util.Scanner;

public class Gender {
    // Write a program to read gender(M/F) and print the corresponding gender using a switch statement
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char gender;
        System.out.println("Please input your gender: M or F?");
        gender = input.next().charAt(0);
        switch (gender) {
            case 'M':
            case 'm':
                System.out.println("Your gender is Male!");
                break;
            case 'F':
            case 'f':
                System.out.println("Your gender is Female!");
                break;
            default:
                System.out.println("Invalid value!");
        }
    }


}

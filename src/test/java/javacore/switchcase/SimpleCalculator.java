package javacore.switchcase;

import java.util.Scanner;

public class SimpleCalculator {
    //Write a program to create simple calculator using switch Statement
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char method;
        double num1, num2, result;
        System.out.println("Please input number then choosing the operation for calculating!");
        System.out.println("Please input the Number 1: ");
        num1 = input.nextDouble();
        System.out.println("Please input the Number 2: ");
        num2 = input.nextDouble();
        System.out.println("Please choose the operation: ");
        method = input.next().charAt(0);
        switch (method){
            case '+':
            {
             result = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + result);
                break;
            }
            case '-':
            {
                result = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + result);
                break;
            }
            case '*':
            {
                result = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + result);
                break;
            }
            case '/':
            {
                result = num1 / num2;
                System.out.println(num1 + " / " + num2 + " = " + result);
                break;
            }
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}

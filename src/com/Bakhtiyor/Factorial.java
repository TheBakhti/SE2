package com.Bakhtiyor;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate the factorial of entered number!");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
    }
}

package com.Bakhtiyor;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }
    static int sum2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scanner.nextInt();
        int sum = num1+num2;
        return sum;
    }
//    static void sum(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter 1st number : ");
//        int num1 = scanner.nextInt();
//        System.out.print("Enter 2nd number: ");
//        int num2 = scanner.nextInt();
//        int sum = num1+num2;
//        System.out.println("The sum of numbers is :"+sum);
//    }
}

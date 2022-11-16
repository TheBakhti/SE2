package com.Bakhtiyor;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(ArmstrongNum(n));
    }

        static boolean ArmstrongNum(int n){
            int sum = 0;
            int original = n;

            while(n>0){
                int rem = n%10;
                n = n/10;
                sum = sum + rem*rem*rem;
            }return sum == original;
        }
    }

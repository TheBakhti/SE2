package com.Bakhtiyor;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num ,rem, sum = 0, a = 0 ;
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int var = num1;
        while(var != 0){
            var = var/10;
            ++a;
        }
        while(var>0){
            rem = var % 10;
            sum = (int) (sum +  Math.pow( rem, a ));
            var = var / 10;
        }
        if(sum == num1){
            System.out.println(num1+"Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}

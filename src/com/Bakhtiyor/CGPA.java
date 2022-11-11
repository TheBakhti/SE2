package com.Bakhtiyor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        int n, count = 1;
        double  xF, averageF, sumF = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of semesters:");
        n = scanner.nextInt();
        do{
            try{
                System.out.println("Enter the "+count+" semester's grade: ");
                xF = scanner.nextInt();
                sumF += xF;
                ++count;

            }catch (InputMismatchException ex) {
                System.out.println("Try again. (Incorrect input: an integer is required)");
                scanner.nextLine();
            }
        }while(count <= n);
        averageF = sumF/n;
        double CGPA = averageF*9.5;
        System.out.println("Your CGPA is "+CGPA);
    }
}

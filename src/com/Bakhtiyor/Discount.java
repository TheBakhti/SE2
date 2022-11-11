package com.Bakhtiyor;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate the discount of product!");
        System.out.print("Enter the origanal price of product: ");
        double org_price = scanner.nextDouble();
        System.out.print("Enter the discount(%):");
        double discount = scanner.nextDouble();
        double dis_product = org_price-(org_price*discount/100);
        System.out.println("The final price for product is "+dis_product);
    }
}

package com.Bakhtiyor;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        StringBuilder input1 = new StringBuilder();

        input1.append(input);

        input1.reverse();

        System.out.println(input1);

    }
}

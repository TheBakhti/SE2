package com.Bakhtiyor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = getArray();

        System.out.println("Enter the index of the array:");

        try{
            System.out.println("The element value is"+
                    array[scanner.nextInt()]);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("The Array is out of bond!");
        }
    }

    public static int[] getArray() {
        int[] array = new int[100];
        for(int i =0; i< array.length;i++)
            array[i] = (int)(Math.random()*100)+1;
        return array;
    }
}

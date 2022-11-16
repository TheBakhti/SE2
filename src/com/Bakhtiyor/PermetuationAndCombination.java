package com.Bakhtiyor;

import java.util.Scanner;

public class PermetuationAndCombination {
    public static void main(String[] args) {
//        int factorialN = 1;
//        int factorialR = 1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Find the nCr!");
//        System.out.print("Enter the selection of r objects: ");
//        int r = scanner.nextInt();
//        System.out.print("Enter the set of n objects: ");
//        int n = scanner.nextInt();
//        for (int i = 1; i <= r; i++) {
//            factorialR = factorialR*i;
//        }
//        for (int i = 1; i <= n; i++) {
//            factorialN = factorialN*i;
//        }
//        if(factorialN > factorialR){
//            System.out.println(factorialN / ((n-r)*factorialR));
//        }
//        else{
//            System.out.println("Please enter n more bigger number!");
//        }

//        public static void main(String arg[])
//        {
//            NcrAndNpr p=new NcrAndNpr( );
//            Scanner sc=new Scanner(System.in);
//            System.out.println("enter value of n");
//            int n=sc.nextInt();
//            System.out.println("enter value of r");
//            int r=sc.nextInt();
//            if(n>=r)
//            {
//                System.out.println("The value of "+n+"p"+r+" is : "+p.permutation(n,r));
//                System.out.println("The value of "+n+"c"+r+" is : "+p.combination(n,r));
//            }
//            else
//                System.out.println("n value should be greater than or equals to r value");
    NcrAndNpr a=new NcrAndNpr();
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of n");
    int n=sc.nextInt();
	System.out.println("Enter value of r");
    int r=sc.nextInt();
	if(n>=r)
    {
        double com=a.fact(n)/(a.fact(n-r)*a.fact(r));
        double per=a.fact(n)/a.fact(n-r);
        System.out.println("The value of "+n+"p"+r+" is : "+per);
        System.out.println("The value of "+n+"c"+r+" is : "+com);
    }
	else
            System.out.println("Please enter n>=r");
    }
}



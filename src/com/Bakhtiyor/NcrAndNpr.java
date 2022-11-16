package com.Bakhtiyor;

public class NcrAndNpr {
//    double fact(double n)
//    {
//        int i=1;
//        double fact=1;
//        while(i<=n)
//        {
//            fact=fact*i;
//            i++;
//        }
//        return fact;
//    }
//    double permutation(int n,int r )
//    {
//        double per=fact(n)/fact(n-r);
//        return per;
//    }
//    double combination(int n,int r)
//    {
//        double com=fact(n)/(fact(n-r)*fact(r));
//        return com;

    double fact(double n)
    {
        double f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}
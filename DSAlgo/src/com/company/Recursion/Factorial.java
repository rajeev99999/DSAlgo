package com.company.Recursion;

public class Factorial {
    public int factorial(int n){
        if(n==1){
            return 1;
        }
        int smallans= n*factorial(n-1);
        return smallans;
    }
}


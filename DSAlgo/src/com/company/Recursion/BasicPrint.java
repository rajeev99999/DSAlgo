package com.company.Recursion;

public class BasicPrint {
    public void print12n(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        print12n(n-1);
        System.out.println(n);
    }
    public void printn21(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printn21(n-1);
    }
}

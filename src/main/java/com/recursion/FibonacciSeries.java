package com.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println(head(3));
        System.out.println(tail(3,0,1));
    }

    private static int tail(int n, int a,int b){
        if(n==0)
            return a;
        if(n==1)
            return b;
        return tail(n-1, b, a+b);
    }

    private static int head(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int fib1 = head(n-1);
        int fib2 = head(n-2);
        return fib2 +fib1;
    }
}


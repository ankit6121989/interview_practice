package com.recursion;

public class FactorialProblem {

    public static void main(String[] args) {
        System.out.println(factorial_headRecursion(6));
        System.out.println(factorial_tailRecursion(6,1));
    }

    private static int factorial_headRecursion(int i) {
        if(i==0)
            return 1;
        return i * factorial_headRecursion(i-1);
    }
    private static int factorial_tailRecursion(int i, int result) {
        if(i==0)
            return result;
        return factorial_tailRecursion(i-1, i* result);
    }
}

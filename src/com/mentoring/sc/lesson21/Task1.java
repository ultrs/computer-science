package com.mentoring.sc.lesson21;

public class Task1 {

    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}

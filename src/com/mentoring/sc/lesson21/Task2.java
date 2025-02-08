package com.mentoring.sc.lesson21;

public class Task2 {

    public static void main(String[] args) {
        int value = 24563;
        System.out.println(sumOfNumbers(value));
    }

    public static int sumOfNumbers(int n) {
        int result = 0;
        do {
            result += n % 10;
            n /= 10;
        }
        while (n != 0);
            return result;
    }
}

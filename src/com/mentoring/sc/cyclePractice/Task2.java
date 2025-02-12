package com.mentoring.sc.cyclePractice;

import java.util.Scanner;
/*
Написать программу, вычисляющую и отображающую все числа Фибоначчи меньше введённого пользователем целого числа.
Решить двумя способами: с помощью цикла и с помощью рекурсии.
 */

public class Task2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        int marker = scanner.nextInt();
        fibonachchiPrinter(marker);
    }

    public static void fibonachchiPrinter(int end) {
        int number = 0;
        int currentNumber = 1;
        while (currentNumber + number < end) {
            currentNumber = currentNumber + number;
            number = currentNumber - number;
            printer(currentNumber);
        }
    }

    public static void printer(int value) {
        System.out.print(value + "  ");
    }
}

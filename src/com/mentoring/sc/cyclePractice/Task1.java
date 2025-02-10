package com.mentoring.sc.cyclePractice;
import java.util.Scanner;

/*
Написать программу, вычисляющую сумму цифр введённого пользователем целого числа.
 */

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number: ");
        int number = scanner.nextInt();
        System.out.println(com.mentoring.sc.lesson21.Task2.sumOfNumbers(number));
    }
}

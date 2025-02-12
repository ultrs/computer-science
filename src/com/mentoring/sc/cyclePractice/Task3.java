package com.mentoring.sc.cyclePractice;

/*
Написать программу, отображающую статистику по осадкам за N дней. N вводится пользователем.
Пользователь также должен ввести N целых чисел, обозначающих величину осадков в день.

Программа должна выводить:

a. Количество дней
b. Сумму осадков за этот период
c. Среднее количество осадков за этот период
d. Максимальное количество дневных осадков за этот период
 */

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days: ");
        int days = scanner.nextInt();
        int[] precipitationDay = new int[days];
        for (int i = 0; i < days; i++) {
            System.out.println("Enter the amount of precipitation: ");
            precipitationDay[i] = scanner.nextInt();
        }
        result(days, precipitationDay);
    }

    private static void result(int days, int[] precipitation) {
        System.out.println("Days: " + days);
        System.out.println("Sum of precipitation: " + sumOfPrecipitation(precipitation));
        System.out.println("Average precipitation: " + sumOfPrecipitation(precipitation) / days);
        System.out.println("Max precipitation: " + maxOfPrecipitation(precipitation));
    }

    private static int sumOfPrecipitation(int[] precipitation) {
        int sum = 0;
        for (int element : precipitation) {
            sum += element;
        }
        return sum;
    }

    private static int maxOfPrecipitation(int[] precipitation) {
        int maxValue = 0;
        for (int element : precipitation) {
            if (maxValue < element) maxValue = element;
        }
        return maxValue;
    }

}

package com.mentoring.sc.functionPractice;

import java.util.Scanner;/*
Задача 1
Имеются три числа - день, месяц и год, вводимые пользователем с консоли.
Вывести дату следующего дня в формате "День.Месяц.Год".
Учесть переход на следующий месяц, а также следующий год.
Форматирование строки "День.Месяц.Год" вынести в отдельную функцию.
 */

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input day: ");
        int day = scanner.nextInt();
        System.out.println("Input month: ");
        int month = scanner.nextInt();
        System.out.println("Input year: ");
        int year = scanner.nextInt();

        if (isDateValid(day, month, year)) {
            printNextDate(day, month, year);
        } else {
            System.out.println("Invalid Date");
        }
    }

    public static void printNextDate(int day, int month, int year) {
        day++;
        if (isDateValid(day, month, year)) {
            System.out.println(day + "." + month + "." + year);
        } else if (isDateValid(1, month + 1, year)) {
            month++;
            System.out.println(1 + "." + month + "." + year);
        } else {
            year++;
            System.out.println(1 + "." + 1 + "." + year);
        }
    }

    public static boolean isDateValid(int day, int month, int year) {
        if (year < 0 || month > 12 || month < 1 || day > 31 || day < 1) {
            return false;
        }

        if (month == 2) {
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        } else {
            return day <= 31;
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

}

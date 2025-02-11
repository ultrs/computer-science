package com.mentoring.sc.homework2.cycleHomework;
/*
Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
Для решения написать 2 функции, которые будут принимать введенное целое число,
а возвращать количество четных цифр (вторая функция - нечетных).

Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

public class Task1 {

    public static void main(String[] args) {
        int numbers = 221890;
        System.out.println("Even: " + evenCounter(numbers));
        System.out.println("Odd: " + oddCounter(numbers));
    }

    private static int evenCounter(int value) {
        int counter = 0;
        while (value != 0) {
            if (isEven(value % 10))
                counter++;
            value /= 10;
        }
        return counter;
    }

    private static boolean isEven(int value) {
        return value % 2 == 0;
    }

    private static int oddCounter(int value) {
        int counter = 0;
        while (value != 0) {
            if (!isEven(value % 10))
                counter++;
            value /= 10;
        }
        return counter;
    }

}

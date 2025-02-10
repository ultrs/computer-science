package com.mentoring.sc.homework2.cycleHomework;
/*
Дано целое число.
Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
Результат вывести на консоль.
Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321

Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 */

public class Task2 {

    public static void main(String[] args) {
        int number = 1234567;
        System.out.println(reversNumber(number));
    }

    private static int reversNumber(int number) {
        int result = 0;
        while (number != 0) {
            result += (number % 10) * 10;
            number /= 10;
        }
        return result / 10;
    }
}

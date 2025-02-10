package com.mentoring.sc.homework2.arrayHomework;
/*
Дан одномерный массив символов.
Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]

Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class Task2 {

    public static void main(String[] args) {
        char[] array = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        getResult(array);
    }

    private static void getResult(char[] array) {
        charArrayPrinter(intToCharTranslator(selectionArray(charToIntTranslator(array))));
        intArrayPrinter(selectionArray(charToIntTranslator(array)));
        averagePrinter(getAverage(charToIntTranslator(array)));
    }

    private static int[] charToIntTranslator(char[] charArray) {
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = (int) charArray[i];
        }
        return intArray;
    }

    private static char[] intToCharTranslator(int[] intArray) {
        char[] charArray = new char[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            charArray[i] = (char) intArray[i];
        }
        return charArray;
    }

    private static int getAverage(int[] intArray) {
        int result = 0;
        for (int i : intArray) {
            result += i;
        }
        return result / intArray.length;
    }

    private static int selectionArrayLength(int[] array) {
        int counter = 0;
        for (int i : array) {
            if (i > getAverage(array)) counter++;
        }
        return counter;
    }

    private static int[] selectionArray(int[] array) {
        int counter = 0;
        int[] result = new int[selectionArrayLength(array)];
        for (int i : array) {
            if (i > getAverage(array)) {
                result[counter] = i;
                counter++;
            }
        }
        return result;
    }

    private static void charArrayPrinter(char[] array) {
        System.out.print("Char array: ");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void intArrayPrinter(int[] array) {
        System.out.print("Int array:  ");
        for (int c : array) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    private static void averagePrinter(int average) {
        System.out.println("Average is: " + average);
    }
}

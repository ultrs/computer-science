package com.mentoring.sc.homework2.arrayHomework;
/*
Дан одномерный массив целых чисел.
Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
После удаления - умножить каждый элемент массива на его длину.
Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]

Не забывать, что всю логику приложения нужно выносить в отдельные функции. main - только для тестирования написанного функционала.
 */

public class Task1 {

    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};
        arrayPrinter(getResult(array));
    }

    private static int[] getResult(int[] array) {
        return getMultipliedArray(getPositive(array));
    }

    private static int[] getPositive(int[] array) {
        int counter = 0;
        int[] result = new int[getPositiveLength(array)];
        for (int element : array)
            if (element >= 0) {
                result[counter] = element;
                counter++;
            }
        return result;
    }

    private static int getPositiveLength(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j >= 0) counter++;
        }
        return counter;
    }

    private static int[] getMultipliedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= array.length;
        }
        return array;
    }

    private static void arrayPrinter(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

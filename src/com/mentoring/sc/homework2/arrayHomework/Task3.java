package com.mentoring.sc.homework2.arrayHomework;
/*
Дан одномерный массив целых чисел.

Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
Возвращает функция эти три массива в виде одного двумерного.

Пример:
                                         [-4, -18]

[-4, 0, 1, 9, 0, -18, 3] ->    [0, 0]

                                         [1, 9, 3]
 */

public class Task3 {

    public static void main(String[] args) {
        int[] array = {-4, 1, 9, -18, 3};
        getResult(array);
    }

    private static void getResult(int[] array) {
        arrayPrinter(getZero(array));
        arrayPrinter(getNegative(array));
        arrayPrinter(getPositive(array));
    }

    private static int[] getPositive(int[] array) {
        int counter = 0;
        if (getPositiveLength(array) == 0) {
            return new int[0];  //Правильно ли?
        } else {
            int[] result = new int[getPositiveLength(array)];
            for (int k : array)
                if (k > 0) {
                    result[counter] = k;
                    counter++;
                }
            return result;
        }
    }

    private static int getPositiveLength(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j > 0) counter++;
        }
        return counter;
    }

    private static int[] getNegative(int[] array) {
        int counter = 0;
        if (getNegativeLength(array) == 0) {
            return new int[0];  //Правильно ли?
        } else {
            int[] result = new int[getNegativeLength(array)];
            for (int k : array)
                if (k < 0) {
                    result[counter] = k;
                    counter++;
                }
            return result;
        }
    }

    private static int getNegativeLength(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j < 0) counter++;
        }
        return counter;
    }

    private static int[] getZero(int[] array) {
        int counter = 0;
        if (getZeroLength(array) == 0) {
            return new int[0];  //Правильно ли?
        } else {
            int[] result = new int[getZeroLength(array)];
            for (int k : array)
                if (k == 0) {
                    result[counter] = k;
                    counter++;
                }
            return result;
        }
    }

    private static int getZeroLength(int[] array) {
        int counter = 0;
        for (int j : array) {
            if (j == 0) counter++;
        }
        return counter;
    }

    private static void arrayPrinter(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

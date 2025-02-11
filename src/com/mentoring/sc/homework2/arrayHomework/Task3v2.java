package com.mentoring.sc.homework2.arrayHomework;

public class Task3v2 {

    private static final int POSITIVE = 0;
    private static final int ZERO = 1;
    private static final int NEGATIVE = 2;

    public static void main(String[] args) {
        int[] array = {-4, 0, 1, 9, 0, -18, 3};
        getResult(array);
    }

    private static void getResult(int[] array) {
        arrayPrinter(getZero(array));
        arrayPrinter(getNegative(array));
        arrayPrinter(getPositive(array));
    }

    private static int[] getPositive(int[] array) {
        int counter = 0;
        if (getLength(array)[POSITIVE] == 0) {
            return new int[0];  //Правильно ли?
        } else {
            int[] result = new int[getLength(array)[POSITIVE]];
            for (int k : array)
                if (k > 0) {
                    result[counter] = k;
                    counter++;
                }
            return result;
        }
    }

    private static int[] getLength(int[] array) {
        int[] counter = {0, 0, 0};
        for (int j : array) {
            if (j > 0) counter[0]++;
            if (j == 0) counter[1]++;
            if (j < 0) counter[2]++;

        }
        return counter;
    }

    private static int[] getNegative(int[] array) {
        int counter = 0;
        if (getLength(array)[NEGATIVE] == 0) {
            return new int[0];  //Правильно ли?
        } else {
            int[] result = new int[getLength(array)[NEGATIVE]];
            for (int k : array)
                if (k < 0) {
                    result[counter] = k;
                    counter++;
                }
            return result;
        }
    }

    private static int[] getZero(int[] array) {
        int counter = 0;
        if (getLength(array)[ZERO] == 0) {
            return new int[0];  //Правильно ли?
        } else {
            int[] result = new int[getLength(array)[ZERO]];
            for (int k : array)
                if (k == 0) {
                    result[counter] = k;
                    counter++;
                }
            return result;
        }
    }

    private static void arrayPrinter(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}

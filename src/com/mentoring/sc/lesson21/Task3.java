package com.mentoring.sc.lesson21;

public class Task3 {

    private final static int CURRENT_YEAR = 2025;
    private final static int START_YEAR = 1626;
    private final static double PERCENT = 0.05;
    private final static int START_SUM = 24;

    public static void main(String[] args) {
        System.out.println(profitCalculator());
    }

    public static double profitCalculator () {
        double result = START_SUM;
        for (int year = 1; year <= CURRENT_YEAR - START_YEAR; year++) {
            result *= PERCENT + 1;
        }
        return result;
    }
}

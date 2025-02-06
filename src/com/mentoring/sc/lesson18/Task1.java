package com.mentoring.sc.lesson18;

public class Task1 {

    public static void main(String[] args) {
        int first = 10;
        int second = 3;
        //System.out.println("max value is: " + getMaxValue(first, second));
        System.out.println("max value is: " + Math.max(first, second));

    }

    public static int getMaxValue(int firstValue, int secondValue) {
        return firstValue > secondValue ? firstValue : secondValue;
//
//        if (firstValue > secondValue) {
//            return firstValue;
//        } else {
//            return secondValue;
//        }
    }

}

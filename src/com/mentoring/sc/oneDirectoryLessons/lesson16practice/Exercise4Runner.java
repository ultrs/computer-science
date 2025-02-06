package com.mentoring.sc.oneDirectoryLessons.lesson16practice;

/*
делиться на 4 без осттатка, но не 100 за исключением 400
 */
public class Exercise4Runner {
    //  [модификатор] * возвращающее значение * название([что принимает]){}
    public static void main(String[] args) {
        int year = 2200;
        System.out.println(isLeapYear(year) ?
                year + " is a leap year":
                year + " is not a leap year");
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

}

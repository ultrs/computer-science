package com.mentoring.sc.homework1;

/*
В переменной minutes лежит число от 0 до 59.
Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).

Протестировать функцию в main.
0-14 = 1, 15-29=2, 30-44=3, 45-59=4
 */

public class HwTask1 {

    public static void main(String[] args) {
//        int minutes = 0;
//        int minutes = 14;
//        int minutes = 15;
//        int minutes = 29;
//        int minutes = 30;
//        int minutes = 44;
//        
        int minutes = 59;
        isQuarter(minutes);
    }

    private static void isQuarter(int value) {
        int quart = value / 15;
//        System.out.println(quarter);
        switch (quart) {
            case 0 -> System.out.println("Quarter 1");
            case 1 -> System.out.println("Quarter 2");
            case 2 -> System.out.println("Quarter 3");
            default -> System.out.println("Quarter 4");
        }
    }

}

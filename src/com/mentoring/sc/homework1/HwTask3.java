package com.mentoring.sc.homework1;

/*
Даны два прямоугольных треугольника.
Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.(КАТЕТЫ???)
Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.

Для этого понадобится написать 2 функции.
Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
Учитывать, что площадь может быть вещественным числом.
 */

public class HwTask3 {

    public static void main(String[] args) {
        int firstTriangleA = 3;
        int firstTriangleB = 4;
        int secondTriangleA = 0;
        int secondTriangleB = 5;
        if (firstTriangleA <= 0 || firstTriangleB <= 0 || secondTriangleA <= 0 || secondTriangleB <= 0) {
            System.out.println("Invalid input");
        } else {
            comparing(areaMeter(firstTriangleA, secondTriangleA), areaMeter(firstTriangleB, secondTriangleB));
        }
    }

    private static double areaMeter(int a, int b) {
        return (double) (a * b) / 2;
    }

    private static void comparing(double firstTriangleSquare, double secondTriangleSquare) {
        if (firstTriangleSquare == secondTriangleSquare) {
            System.out.println("The area of the first triangle is equal to the second");
        } else if (firstTriangleSquare > secondTriangleSquare) {
            System.out.println("The area of the first triangle is more than the second");
        } else {
            System.out.println("The area of the first triangle is less than the second");
        }
    }

}

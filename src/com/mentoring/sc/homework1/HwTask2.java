package com.mentoring.sc.homework1;

/*
Даны 3 переменные:

- operand1 (double)
- operand2 (double)
- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)

Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
Протестировать функцию в main.

Например:
Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
Результат: 34.5 (24.4 + 10.1)
 */
public class HwTask2 {

    private final static char ADDITION = '+';
    private final static char SUBTRACTION = '-';
    private final static char MULTIPLICATION = '*';
    private final static char DIVISION = '/';
    private final static char MODULUS = '%';
    public static void main(String[] args) {
        double operand1 = 24.4;
        double operand2 = 2;
        char operation = DIVISION;

        System.out.println(calculator(operation, operand1, operand2) +
                " (" + operand1 + " " + operation + " " + operand2 + ")");
    }

    public static double calculator(char operation, double firstValue, double secondValue) {
        return switch (operation) {
            case '+' -> addition(firstValue, secondValue);
            case '-' -> subtraction(firstValue, secondValue);
            case '*' -> multiplication(firstValue, secondValue);
            case '/' -> secondValue == 0 ? null : division(firstValue, secondValue);
            case '%' -> secondValue == 0 ? null : modulus(firstValue, secondValue);
            default -> throw new IllegalArgumentException("Invalid mathematical operation");
        };
    }

    private static double addition(double operand1, double operand2) {
        return operand1 + operand2;
    }
    private static double subtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }
    private static double multiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }
    private static double division(double operand1, double operand2) {
        return operand1 / operand2;
    }
    private static double modulus(double operand1, double operand2) {
        return operand1 % operand2;
    }

}


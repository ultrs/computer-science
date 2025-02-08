package com.mentoring.sc.lesson21;

public class Task4 {

    public static void main(String[] args) {
        int value = 1;
        System.out.println( isSimpleNumber(value) ? "The Number is a simple" : "The Number is not a simple" );
    }

    public static boolean isSimpleNumber(int value) {
        int flag = 0;
        for (int i = value; i > 0; i--) {
            if (value % i != 0) {
                continue;
            } else {
                flag++;
            }
        }
        return flag <= 2 ? true : false;
    }
}

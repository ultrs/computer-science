package com.mentoring.sc.oneDirectoryLessons.lesson16practice;

public class Exercise1Runner {
    public static void main(String[] args) {
//        var month = 11;
//        String result = switch (month) {
//            case 12, 1, 2 -> "Winter";
//            case 3, 4, 5 -> "Spring";
//            case 6, 7, 8 -> "Summer";
//            case 9, 10, 11 -> "Autumn";
//            default -> "Month is invalid";
//        };
//        System.out.println(result);
        var month = 8;
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        }else if (month == 3 || month == 4 || month == 5) {
            System.out.println("Spring");
        }else if (6 <= month && month < 9) {
            System.out.println("Summer");
        }else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Month is invalid");
        }
    }
}

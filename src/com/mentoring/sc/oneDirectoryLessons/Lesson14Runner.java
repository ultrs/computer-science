package com.mentoring.sc.oneDirectoryLessons;

public class Lesson14Runner {

    public static void main(String[] args) {
        // long, float, double, boolean - НЕЛЬЗЯ!!!
        int month = 11;
        switch (month) {
            case 9:
            case 10:
            case 11:
                System.out.println("Autum");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            default:
                System.out.println("Month is invalid");
        }
    }

}

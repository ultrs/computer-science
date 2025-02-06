package com.mentoring.sc.oneDirectoryLessons;

public class Lesson15Runner {
    public static void main(String[] args) {
        var month = 11;
        String result = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Autumn";
            default -> "Month is invalid";
        };
        System.out.println(result);
//            case 9:
//            case 10:
//            case 11:
//                System.out.println("Autumn");
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.println("Winter");
//                break;
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Spring");
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.println("Summer");
//                break;
//            default:
//                System.out.println("Month is invalid");
//        }
    }
}

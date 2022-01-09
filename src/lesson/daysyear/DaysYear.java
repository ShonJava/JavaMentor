package lesson.daysyear;

import java.util.Scanner;

public class DaysYear {
    public static void main(String[] args) {
        Scanner console =new Scanner(System.in);

        int numbersOfDays = 0;
        String namesOfMounth = "Default";

        System.out.println("Input mounth number");
        int mounth = console.nextInt();

        System.out.println("Input a year");
        int year = console.nextInt();

        switch (mounth) {
            case 1:
                namesOfMounth = "January";
                numbersOfDays = 31;
                break;
            case 2:
                namesOfMounth = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    numbersOfDays = 29;
                } else {
                    numbersOfDays = 28;
                }
                break;
            case 3:
                namesOfMounth = "March";
                numbersOfDays = 31;
                break;
            case 4:
                namesOfMounth = "April";
                numbersOfDays = 30;
                break;
            case 5:
                namesOfMounth = "May";
                numbersOfDays = 31;
                break;
            case 6:
                namesOfMounth = "June";
                numbersOfDays = 30;
                break;
            case 7:
                namesOfMounth = "July";
                numbersOfDays = 31;
                break;
            case 8:
                namesOfMounth = "August";
                numbersOfDays = 31;
                break;
            case 9:
                namesOfMounth = "September";
                numbersOfDays = 30;
                break;
            case 10:
                namesOfMounth = "October";
                numbersOfDays = 31;
                break;
            case 11:
                namesOfMounth = "November";
                numbersOfDays = 30;
                break;
            case 12:
                namesOfMounth = "December";
                numbersOfDays = 31;
                break;
            default:
                System.out.println("Error");

        }
        System.out.println(numbersOfDays + " days in " + namesOfMounth + " " + year);
    }
}

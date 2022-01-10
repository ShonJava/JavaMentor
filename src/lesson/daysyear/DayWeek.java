package lesson.daysyear;

import java.util.Scanner;

public class DayWeek {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("input number");
        int day = console.nextInt();

        System.out.println(dayWeek(day));
    }

    public static String dayWeek(int day) {
        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Thusday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Error");
        }
        return dayName;
    }
}

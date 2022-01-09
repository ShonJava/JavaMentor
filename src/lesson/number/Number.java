package lesson.number;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input a number");
        int number = console.nextInt();
        if (number == 0) {
            System.out.println("Your number is " + number);
        } else if (number < 0) {
            System.out.println(number + " negative number");
        } else {
            System.out.println(number + " pozitive number");
        }

    }
}

package lesson.number;

import java.util.Scanner;

public class Halfsum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input 5 number");
        int one = console.nextInt();
        int two = console.nextInt();
        int three = console.nextInt();
        int four = console.nextInt();
        int five = console.nextInt();
        System.out.println("result half of sum numbers" + (one + two + three + four + five) / 2);
    }
}

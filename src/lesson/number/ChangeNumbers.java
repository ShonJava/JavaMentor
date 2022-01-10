package lesson.number;

import java.util.Scanner;

public class ChangeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("input first number");
        int a = console.nextInt();
        System.out.println("input second number");
        int b = console.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("first number " + a);
        System.out.println("second number " + b);
    }
}

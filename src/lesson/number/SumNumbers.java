package lesson.number;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.println("Введите число");
        int number = console.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
            sum += i;
        }
        System.out.println("Сумма чисел от 1 до " + number + "равна: " + sum);
    }
}

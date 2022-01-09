package lesson.number;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = console.nextInt();
        System.out.println("Сумма всех чисел от выражения равна: " + sum(number));
    }
    public static int sum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

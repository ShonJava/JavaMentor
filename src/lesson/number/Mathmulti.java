package lesson.number;

import java.util.Scanner;

public class Mathmulti {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Input number");
        int a = console.nextInt();
        for(int i = 0; i < 10; i++) {
            System.out.println(a + " x " + i + " = " + (a * i));
        }
    }
}

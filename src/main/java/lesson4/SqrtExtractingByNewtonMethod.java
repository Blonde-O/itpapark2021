package lesson4;

import java.util.Scanner;

public class SqrtExtractingByNewtonMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, из которого хотите извлечь квадратный корень");
        double n = in.nextDouble();
        System.out.println("Ваш результат равен  " + sqrt(n));
        System.out.println("Проверка результата  " + sqrt(n) * sqrt(n));
    }

    public static double sqrt(double n) {
        double a = 1;
        for (double i = 1; i <= 1000; i++) {
            a = a - (a * a - n) / (2 * n);
        }
        return a;

    }

}

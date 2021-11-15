package lesson4;

import java.util.Scanner;

public class AnyRootCounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, из которого извлекаете корень");
        double n = in.nextDouble();
        System.out.println("Введите степень извлекаемого корня");
        double m = in.nextDouble();
        double result = anyRoot(n, m);
        double g = 1;
        System.out.println("Ваш результат равен:\n" + result);
        for (double i = 1; i <= m; i++) {
            g = g * result;
        }
        System.out.println("Проверка результата\n" + g);
    }

    public static double anyRoot(double n, double m) {
        double a = 1;
        for (double i = 1; i <= 100; i++) {
            double b = 1;
            for (double j = 1; j <= (m - 1); j++) {
                b = b * a;
            }
            a = a - (a * b - n) / (m * b);
        }
        return a;
    }
}

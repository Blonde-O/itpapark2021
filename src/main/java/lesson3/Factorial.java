package lesson3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите вычислить");
        long n = in.nextLong();
        System.out.println("Результат:\n!" + n + "=" + calcFactorial(n));
        in.close();
    }

    public static long calcFactorial(long n) {
        long result = 1;
        for (int i = 1; i <= n; i++)
            System.out.println(result *= i);
        return result;
    }
}

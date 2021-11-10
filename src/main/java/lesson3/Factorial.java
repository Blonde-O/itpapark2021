package lesson3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, факториал которого хотите вычислить");
        long n = in.nextLong();
        System.out.println("Результат:");
        System.out.println("!" + n + "=" + calcFactorial(n));
        in.close();
    }

    public static long calcFactorial(long n) {
        long result = 1;
        for (long i = 1; i <= n; i++)
            result = result * i;
        return result;
    }
}

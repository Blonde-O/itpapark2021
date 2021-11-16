package lesson5;

import java.util.Scanner;

public class Fibonachchi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите порядковый номер Числа Фибоначчи \nn= ");
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("Искомое число Фибоначчи равно 0");
            return;
        }
        if (n == 1) {
            System.out.println("Искомое число Фибоначчи равно 1");
            return;
        }
        System.out.println("Искомое число Фибоначчи равно " + fibonachchiRecursion(n));
        System.out.println("Искомое число Фибоначчи равно " + fibonachichiFor(n));
    }

    public static int fibonachchiRecursion(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonachchiRecursion(n - 1) + fibonachchiRecursion(n - 2);
        }
    }

    public static int fibonachichiFor(int n) {
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; ++i) {
            int result = a + b;
            a = b;
            b = result;
        }
        return b;
    }
}



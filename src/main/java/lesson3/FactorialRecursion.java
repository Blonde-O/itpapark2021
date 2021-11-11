package lesson3;

import java.util.Scanner;

public class FactorialRecursion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число, факториал которого желаете вычислить");
        long n = in.nextLong();
        System.out.println("Решение: !" + n + " = " + factorial(n));
    }

    public static long factorial(long n) {
        if (n <= 1) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
    }
}


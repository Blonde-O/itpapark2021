package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class FibonachichiByArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String s;
        int m;
        int[] initialArray = new int[30];
        System.out.println("\nВведите индекс искомого числа Фибоначчи");
        n = in.nextInt();
        if (n == 0) {
            System.out.println("Ваше число Фиббоначи равно\t 0");
            return;
        }
        int a = 1;
        int b = 1;
        for (int i = 0; i < n; i++) {
            initialArray[i] = a;
            int result = a + b;
            a = b;
            b = result;
        }
        System.out.println(Arrays.toString(initialArray));
        System.out.println("Ваше число Фибоначчи равно  " + initialArray[n - 1]);
        do {
            m = in.nextInt();

            if (m <= n) {
                System.out.println(Arrays.toString(initialArray));
                System.out.println("Ваше число Фибоначчи равно  " + initialArray[m - 1]);
            } else {
                int c = initialArray[n - 2];
                int d = initialArray[n - 1];
                for (int i = n; i < m; i++) {
                    int newResult = c + d;
                    initialArray[i] = newResult;
                    c = d;
                    d = newResult;
                }
                System.out.println(Arrays.toString(initialArray));
                System.out.println("Ваше число Фибоначчи равно  " + initialArray[m - 1]);
            }
            System.out.println("\nВведите \"exit\" для выхода или любой другой символ для продолжения");
            s = in.next();
        }
        while (!s.equals("exit"));
        System.out.println("До встречи!");
    }
}

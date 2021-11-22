package lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class FibonachichiByArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        String s;
        int[] initialArray = new int[30];
        System.out.println("Введите индекс искомого числа Фибоначчи");
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
            System.out.println("\nВведите индекс искомого числа Фибоначчи или 'exit' для выхода из программы");
            s = in.next();
            if (s.equals("exit")) {
                break;
            }
            m = Integer.parseInt(s);
            if (m > n) {
                int c = initialArray[n - 2];
                int d = initialArray[n - 1];
                for (int i = n; i < m; i++) {
                    int newResult = c + d;
                    initialArray[i] = newResult;
                    c = d;
                    d = newResult;
                }
            }
            System.out.println(Arrays.toString(initialArray));
            System.out.println("Ваше число Фибоначчи равно  " + initialArray[m - 1]);
        }
        while (true);
        System.out.println("До встречи!");
    }
}

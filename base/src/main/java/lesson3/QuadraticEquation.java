package lesson3;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите коэффициент а=  ");
        double a = in.nextDouble();
        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
            return;
        }
        System.out.print("Введите коэффициент b=  ");
        double b = in.nextDouble();
        System.out.print("Введите коэффициент c=  ");
        double c = in.nextDouble();
        double d = discriminant(a, b, c);
        String discr = String.format("%.3f", d);
        System.out.println("Квадратное уравнение имеет вид:");
        if (b > 0) {
            System.out.print(a + "X^2 + " + b + "X");
        } else {
            System.out.print(a + "X^2 " + b + "X");
        }
        if (c > 0) {
            System.out.print(" + " + c);
        } else {
            System.out.println(" " + c);
        }
        System.out.println("Дискриминант равен  " + discr);
        if (d == 0) {
            double z = solution1(a, b);
            String result = String.format("%.3f", z);
            System.out.println("Единственное решение уравнения  " + result);

        } else if (d < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else {
            double z1 = solution2(a, b, d);
            String result1 = String.format("%.3f", z1);
            double z2 = solution3(a, b, d);
            String result2 = String.format("%.3f", z2);
            System.out.println("Первое решение уравнения:   " + result1);
            System.out.println("Второе решение уравнения:   " + result2);
        }
        in.close();
    }

    public static double discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public static double solution1(double a, double b) {
        return -b / 2 * a;
    }

    public static double solution2(double a, double b, double d) {
        return (-b + Math.sqrt(d)) / 2 * a;
    }

    public static double solution3(double a, double b, double d) {
        return (-b - Math.sqrt(d)) / 2 * a;
    }
}

package lesson2;

import java.util.Scanner;

public class Equation {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Данная программа вычисляет силу трения на наклонной поверхности.");
        System.out.println("Введите массу объекта в кг: ");
        double mas = in.nextDouble();
        System.out.println("Введите коэффициент трения: ");
        double frictionCoefficient = in.nextDouble();
        System.out.println("Введите угол наклона пов-ти в градусах: ");
        double incline = in.nextDouble();
        System.out.print("Сила трения составляет: ");
        double result = frictionForce(mas, frictionCoefficient, incline);
        System.out.printf("%.2f", result);
        in.close();
    }

    public static double frictionForce(double mass, double coefficientOfFriction, double angle) {
        double weight = 9.81 * mass;
        double friction = weight * coefficientOfFriction * Math.cos(Math.toRadians(angle));
        return friction;
    }
}

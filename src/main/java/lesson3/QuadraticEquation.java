package lesson3;

public class QuadraticEquation<d> {

    public static void main(String[] args) {
        double a = 2;
        double b = 2;
        double c = 0.5;
        double d = discriminant(a, b, c);

        if (a == 0) {
            System.out.println("Первый коэффициент не может быть 0");
            return;
        } else {
        }

        if (d == 0) {
            double z = solution1(a, b, c);
            String result = String.format("%.2f", z);
            System.out.print("Единственное решение уравнения  ");
            System.out.println(result);
        } else {
        }
        if (d < 0) {
            System.out.println("Нет действительных решений уравнения");
        } else {
        }
        if (d > 0) {
            double z1 = solution2(a, b, c);
            String result1 = String.format("%.2f", z1);
            double z2 = solution3(a, b, c);
            String result2 = String.format("%.2f", z2);
            System.out.print("Первое решение уравнения:   ");
            System.out.println(result1);
            System.out.print("Второе решение уравнения:   ");
            System.out.println(result2);
        } else {
        }
        return;
    }

    public static double discriminant(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        return d;
    }

    public static double solution1(double a, double b, double c) {
        double x = -b / 2 * a;
        return x;
    }

    public static double solution2(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b + Math.sqrt(d)) / 2 * a;
        return x1;

    }

    public static double solution3(double a, double b, double c) {
        double d = Math.pow(b, 2) - 4 * a * c;
        double x2 = (-b - Math.sqrt(d)) / 2 * a;
        return x2;

    }
}

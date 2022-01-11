package attempts;

import java.util.Scanner;

public class ConsoleInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение коэффициента a");
        int a = in.nextInt();
        System.out.println("Введите значение коэффициента b");
        int b = in.nextInt();
        System.out.println("Введите значение коэффициента c");
        int c = in.nextInt();
        if (b > 0) {
            System.out.print(a + "X^2 + " + b + "X");
        } else {
            System.out.print(a + "X^2 " + b + "X");
        }
        if (c > 0) {
            System.out.print(" + " + c);
        } else {
            System.out.print(" " + c);
        }
    }
}

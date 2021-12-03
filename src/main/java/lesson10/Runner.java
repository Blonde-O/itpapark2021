package lesson10;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение давления для конвертации");
        double x = in.nextDouble();
        Pressure forward= Pressure.BAR;
        System.out.print(x+ " " +forward.name()+ "  равно: ");
        forward.action(x);
        Pressure reverse= Pressure.ATM;
        System.out.print(x+ " " +reverse.name()+ "  равно: ");
        reverse.action(x);
    }
}

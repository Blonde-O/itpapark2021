package lesson10.firstSolution;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение давления для конвертации");
        double x = in.nextDouble();
        Pressure f1 = Pressure.BAR;
        Pressure f2 = Pressure.ATM;
        Pressure f3 = Pressure.PSI;
        Pressure[] pressures = new Pressure[]{f1, f2, f3};
        for (Pressure steps : pressures) {
            System.out.print(x + " " + steps.name() + "  равно: ");
            steps.action(x);
        }
    }

}

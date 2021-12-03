package lesson10;

import java.util.Scanner;

public class NewRunner {
    public static void main(String[] args) {
        PressureSimple p1 = PressureSimple.BAR;
        PressureSimple p2 = PressureSimple.ATM;
        PressureSimple p3 = PressureSimple.PSI;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите значение давления для конвертации");
        double x = in.nextDouble();
        System.out.println("Введите единицу измерения, которую хотите преобразовать" +p1.name()+ " " +p2.name()+ " " +p3.name());
        String first= in.next();
        System.out.println("Введите единицу измерения,  в которую хотите преобразовать" +p1.name()+ " " +p2.name()+ " " +p3.name());
        String second= in.next();
        //double x=100;
        Double[][] convertionArray = {{1.0, 0.987, 14.504}, {1.013, 1.0, 14.696}, {0.069, 0.068, 1.0}};
        //String first = "BAR";
       // String second = "PSI";
        if (first.equals("BAR") && second.equals("PSI")) {
            x *= convertionArray[p1.ordinal()][p3.ordinal()];
            System.out.printf("%.2f " +p3.name()+ "",  x);
        }
        if (first.equals("BAR") && second.equals("ATM")) {
            x *= convertionArray[p1.ordinal()][p2.ordinal()];
            System.out.printf("%.2f " +p2.name()+ "",  x);
        }
        if (first.equals("ATM") && second.equals("PSI")) {
            x *= convertionArray[p2.ordinal()][p3.ordinal()];
            System.out.printf("%.2f " +p3.name()+ "",  x);
        }
        if (first.equals("ATM") && second.equals("BAR")) {
            x *= convertionArray[p2.ordinal()][p1.ordinal()];
            System.out.printf("%.2f " +p1.name()+ "",  x);
        }
        if (first.equals("PSI") && second.equals("ATM")) {
            x *= convertionArray[p3.ordinal()][p2.ordinal()];
            System.out.printf("%.2f " +p2.name()+ "",  x);
        }
        if (first.equals("PSI") && second.equals("BAR")) {
            x *= convertionArray[p3.ordinal()][p1.ordinal()];
            System.out.printf("%.2f " +p1.name()+ "",  x);
        }

    }
}

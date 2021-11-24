package attempts.forclasses;

import java.util.Scanner;

public class AddSomeFuel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите категорию ТС (A,B или C)");
        String cat = in.next();
        System.out.println("Введите расстояние");
        int dist = in.nextInt();

        Vehicle car = new Vehicle(cat, dist);
        car.determinationOfVehicle();
        System.out.println("Для категории " + cat+  " объем бака составляет " +car.getTankCapacity()+ "л., а расход топлива " +car.getConsumption()+ "л/100км.");




    }

}


package attempts.forclasses;

import java.util.Scanner;

public class AddSomeFuel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите категорию ТС (мотоцикл ,легковая  или грузовая)");
        String cat = in.next();
        System.out.println("Введите расстояние");
        int dist = in.nextInt();
        System.out.println("Введите заполненность бака в %");
        int fullness = in.nextInt();

        Vehicle car = new Vehicle(dist);
        car.setCategory(cat);
        car.setTankFullness(fullness);
        car.determinationOfVehicle();
        car.determinationOfFuel();
        System.out.println("Для категории " + car.getCategory()+  " объем бака составляет " +car.getTankCapacity()+ "л., а расход топлива " +car.getConsumption()+ "л/100км.");
        System.out.println("Чтобы проехать " +dist+ " километров, вам нужно " +car.getReserve()+ " литров топлива");
        System.out.println("Вам необходимо заправиться " + car.getRefueling()+ " раз.");


    }

}


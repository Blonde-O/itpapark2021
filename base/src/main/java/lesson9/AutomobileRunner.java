package lesson9;

import lesson9.sources.Automobile;
import lesson9.sources.Car;
import lesson9.sources.Truck;

public class AutomobileRunner {

    public static void main(String[] args) {
        Automobile car1 = new Car();
        Automobile car2 = new Car();
        Automobile car3 = new Car();
        Automobile car4 = new Car();
        Automobile car5 = new Car();
        Automobile truck1 = new Truck();
        Automobile truck2 = new Truck();
        Automobile truck3 = new Truck();
        Automobile truck4 = new Truck();
        Automobile truck5 = new Truck();
        Automobile[] vehicles = new Automobile[]{car1, car2, car3, car4, car5, truck1, truck2, truck3, truck4, truck5};

        for (Automobile steps : vehicles) {
            int a = (int) Math.round(Math.random() * 1000);
            System.out.print("Заданная дистанция " + a + " км. \t");
            steps.move(a);
        }
    }
}

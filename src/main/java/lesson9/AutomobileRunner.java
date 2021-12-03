package lesson9;

import lesson9.sources.Automobile;
import lesson9.sources.Car;
import lesson9.sources.Truck;

public class AutomobileRunner {

    public static void main(String[] args) {
        int a = 0;
        /*a = (int) Math.round(Math.random()*1000);
        System.out.println(a);*/
        Automobile car1 = new Car(a);
        Automobile car2 = new Car(a);
        Automobile car3 = new Car(a);
        Automobile car4 = new Car(a);
        Automobile car5 = new Car(a);
        Automobile truck1 = new Truck(a);
        Automobile truck2 = new Truck(a);
        Automobile truck3 = new Truck(a);
        Automobile truck4 = new Truck(a);
        Automobile truck5 = new Truck(a);
        Automobile [] vehicles = new Automobile[] {car1, car2, car3, car4,car5, truck1, truck2, truck3, truck4, truck5};
        for (Automobile steps: vehicles){
          a = (int) Math.round(Math.random()*1000);
        System.out.print("Заданная дистанция " +a+ " км. \t");
        steps.move(a);
        }
    }
}

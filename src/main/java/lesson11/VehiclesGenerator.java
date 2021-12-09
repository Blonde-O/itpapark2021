package lesson11;

public class VehiclesGenerator {
    Vehicles car1 = new Car();
    Vehicles car2 = new Car();
    /* Vehicles car3 = new Car();
     Vehicles car4 = new Car();
     Vehicles car5 = new Car();*/
    Vehicles truck1 = new Truck();
    Vehicles truck2 = new Truck();
    Vehicles[] cars = new Vehicles[]{car1, car2};
    Vehicles[] trucks = new Vehicles[]{truck1, truck2};
    Vehicles[] vehicles = new Vehicles[]{car1, car2/*, car3, car4, car5*/, truck1, truck2};

    public Vehicles[] getVehicles() {
        return vehicles;
    }

    public void carGenerator() {

        for (Vehicles steps : cars) {
            steps.setNumber((int) (99 + Math.random() * 900));
            steps.setSpeed((int) (10+Math.random() * 150));
            steps.setWeight((int) (1000+Math.random() * 2600));
            steps.setHeight(Math.ceil((1.5 + Math.random() * 2) * Math.pow(10, 2)) / Math.pow(10, 2));
            steps.setWidth(Math.ceil((1.5 + Math.random() * 1.5) * Math.pow(10, 2)) / Math.pow(10, 2));
            steps.setLength(Math.ceil((3 + Math.random() * 3) * Math.pow(10, 2)) / Math.pow(10, 2));
            System.out.println(steps);
        }
    }

    public void truckGenerator() {

        for (Vehicles steps : trucks) {
            steps.setNumber((int) (99 + Math.random() * 900));
            steps.setSpeed((int) (10+Math.random() * 91));
            steps.setWeight((int) (3000+Math.random() * 8000));
            steps.setHeight(Math.ceil((3 + Math.random() * 2) * Math.pow(10, 2)) / Math.pow(10, 2));
            steps.setWidth(Math.ceil((2.3 + Math.random()) * Math.pow(10, 2)) / Math.pow(10, 2));
            steps.setLength(Math.ceil((5 + Math.random() * 7) * Math.pow(10, 2)) / Math.pow(10, 2));
            System.out.println(steps);
        }
    }

}

package lesson11;

public class VehiclesGenerator {
    Vehicles car1 = new Car();
    Vehicles car2 = new Car();
    Vehicles car3 = new Car();
    Vehicles car4 = new Car();


    public Vehicles getCar1() {
        System.out.println(car1);
        return car1;
    }

    public Vehicles getCar2() {
        return car2;
    }

    public Vehicles getCar3() {
        return car3;
    }

    public Vehicles getCar4() {
        return car4;
    }

    public Vehicles getCar5() {
        return car5;
    }

    public Vehicles[] getVehicles() {
        return vehicles;
    }

    Vehicles car5 = new Car();
    Vehicles[] vehicles = new Vehicles[]{car1, car2, car3, car4, car5};

        public void generator() {

            for (Vehicles steps : vehicles) {
                steps.setNumber((int) (1000 - Math.random() * 1000));
                steps.setSpeed((int) (Math.random() * 200));
                steps.setWeight((int) (Math.random() * 8000));
                steps.setHeight(Math.ceil((1.5 + Math.random() * 3) * Math.pow(10, 2)) / Math.pow(10, 2));
                steps.setWidth(Math.ceil((Math.random() * 1 + 2) * Math.pow(10, 2)) / Math.pow(10, 2));
                steps.setLength(Math.ceil((Math.random() * 12) * Math.pow(10, 2)) / Math.pow(10, 2));
                System.out.println(steps);
            }
        }

}

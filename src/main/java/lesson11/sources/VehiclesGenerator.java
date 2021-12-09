package lesson11.sources;

public class VehiclesGenerator implements Generating {
    private final Vehicles[] cars;
    private final Vehicles[] trucks;
    private final Vehicles[] vehicles;

    public VehiclesGenerator() {
        Vehicles car1 = new Car();
        Vehicles car2 = new Car();
        Vehicles car3 = new Car();
        Vehicles car4 = new Car();
        Vehicles car5 = new Car();
        Vehicles car6 = new Car();
        Vehicles car7 = new Car();
        Vehicles car8 = new Car();
        Vehicles car9 = new Car();
        Vehicles car10 = new Car();
        Vehicles car11 = new Car();
        Vehicles car12 = new Car();
        Vehicles car13 = new Car();
        Vehicles car14 = new Car();
        Vehicles car15 = new Car();
        Vehicles truck1 = new Truck();
        Vehicles truck2 = new Truck();
        Vehicles truck3 = new Truck();
        Vehicles truck4 = new Truck();
        Vehicles truck5 = new Truck();
        Vehicles truck6 = new Truck();
        Vehicles truck7 = new Truck();
        Vehicles truck8 = new Truck();
        Vehicles truck9 = new Truck();
        Vehicles truck10 = new Truck();
        Vehicles truck11 = new Truck();
        Vehicles truck12 = new Truck();
        Vehicles truck13 = new Truck();
        Vehicles truck14 = new Truck();
        Vehicles truck15 = new Truck();
        vehicles = new Vehicles[]{car1, car2, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12, car13, car14, car15, truck1, truck2, truck2, truck3, truck4, truck5, truck6, truck7, truck8, truck9, truck10, truck11, truck12, truck13, truck14, truck15};
        trucks = new Vehicles[]{truck1, truck2, truck2, truck3, truck4, truck5, truck6, truck7, truck8, truck9, truck10, truck11, truck12, truck13, truck14, truck15};
        cars = new Vehicles[]{car1, car2, car2, car3, car4, car5, car6, car7, car8, car9, car10, car11, car12, car13, car14, car15};
    }

    public Vehicles[] getVehicles() {
        return vehicles;
    }

    @Override
    public void generateCars() {
        for (Vehicles steps : cars) {
            steps.setNumber((int) (99 + Math.random() * 900));
            steps.setSpeed((int) (10 + Math.random() * 150));
            steps.setWeight((int) (1 + Math.random() * 2.6));
            steps.setHeight(Math.ceil((1.5 + Math.random() * 2) * Math.pow(10, 2)) / Math.pow(10, 2));
            steps.setWidth(Math.ceil((1.5 + Math.random() * 1.5) * Math.pow(10, 2)) / Math.pow(10, 2));
            steps.setLength(Math.ceil((3 + Math.random() * 3) * Math.pow(10, 2)) / Math.pow(10, 2));
            //System.out.println(steps); // Раскоменть увидишь распечатку сгенерированных машин
        }
    }

    @Override
    public void generateTrucks() {
        for (Vehicles steps : trucks) {
            steps.setNumber((int) (99 + Math.random() * 900));
            steps.setSpeed((int) (10 + Math.random() * 91));
            steps.setWeight((int) (3 + Math.random() * 8));
            steps.setHeight(Math.ceil((3 + Math.random() * 2) * Math.pow(10, 2)) / Math.pow(10, 2));
            steps.setWidth(Math.ceil((2.3 + Math.random()) * Math.pow(10, 2)) / Math.pow(10, 2));
            steps.setLength(Math.ceil((5 + Math.random() * 7) * Math.pow(10, 2)) / Math.pow(10, 2));
            //System.out.println(steps); // Раскоменть увидишь распечатку сгенерированных машин
        }
    }
}

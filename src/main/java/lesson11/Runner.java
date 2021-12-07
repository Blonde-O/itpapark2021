package lesson11;

public class Runner {


    public static void main(String[] args) throws Exception {
        VehiclesGenerator v1 = new VehiclesGenerator();
        v1.generator();

        for (Vehicles steps : v1.getVehicles()) {
            try {
                if (steps.getSpeed() > 80) {
                    throw new Exception("Автомобиль с номером " + steps.getNumber() + "! Вы превысили скорость 80 км/ч");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


        }
    }
}
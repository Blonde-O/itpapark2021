package lesson11;

public class Runner2 {


    public static void main(String[] args) throws Exception {
        String message1 = null;
        VehiclesGenerator v1 = new VehiclesGenerator();
        v1.generator();


            for (Vehicles steps : v1.getVehicles()) {
                try {
                    if (steps.getSpeed() > 100) {
                        message1 = " превысил скорость 100 км/ч. \t\t !!!Объявляем розыск!!!";
                        throw new Exception();
                    }
                    message1 = "может проезжать";
                } catch (Exception с) {
                    System.out.println("Автомобиль с номером " + steps.getNumber() + "" +message1);
                }

            }
            for (Vehicles steps : v1.getVehicles()) {
                try {
                    if (steps.getSpeed() > 80 & steps.getSpeed() < 100) {
                        throw new Exception("Автомобиль с номером " + steps.getNumber() + " превысил скорость 80 км/ч");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            for (Vehicles steps : v1.getVehicles()) {
                try {
                    if (steps.getWeight() > 5000) {
                        throw new Exception("Масса автомобиля с номером " + steps.getNumber() + " превышает допустимую.");
                    }
                } catch (Exception с) {
                    System.out.println(с.getMessage());
                }
            }
            for (Vehicles steps : v1.getVehicles()) {
                try {
                    if (steps.getHeight() > 4) {
                        throw new Exception("Масса автомобиля с номером " + steps.getNumber() + " превышает допустимую.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            for (Vehicles steps : v1.getVehicles()) {
                try {
                    if (steps.getWidth() > 2.5) {
                        throw new Exception("Ширина автомобиля с номером " + steps.getNumber() + " превышает допустимую.");
                    }
                } catch (Exception f) {
                    System.out.println(f.getMessage());
                }
            }
        }
    }

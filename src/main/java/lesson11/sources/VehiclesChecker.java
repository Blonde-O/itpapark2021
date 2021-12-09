package lesson11.sources;

public class VehiclesChecker implements Checking {
    private final VehiclesGenerator generation = new VehiclesGenerator();

    public VehiclesChecker() {
        generation.generateCars();
        generation.generateTrucks();
    }

    @Override
    public void startCheck() {
        for (Vehicles steps : generation.getVehicles()) {
            String message1 = "";
            String message2 = "";
            String message3 = "";
            String message4 = "";
            try {
                if (steps.getSpeed() > 100) {
                    throw new Exception(" скорость 100 км/ч. !!!Объявляем розыск!!!");
                }
            } catch (Exception a) {
                message1 = a.getMessage();
            }
            try {
                if (steps.getSpeed() > 80 & steps.getSpeed() < 100) {
                    throw new Exception(" скорость 80 км/ч");
                }
            } catch (Exception b) {
                message2 = b.getMessage();
            }
            try {
                if (steps.getWeight() > 8000) {
                    throw new Exception(" допустимую массу.");
                }
            } catch (Exception c) {
                message3 = c.getMessage();
            }
            try {
                if (steps.getHeight() > 4 && steps.getWidth() > 2.5) {
                    throw new Exception(" допустимую высоту и ширину.");
                }
            } catch (Exception d) {
                message4 = d.getMessage();
            }
            if (message1.equals("") & message2.equals("") & message3.equals("") & message4.equals("")) {
                System.out.println(steps.getType() + " автомобиль с номером " + steps.getNumber() + " может проехать через КПП!");
            } else {
                System.out.println(steps.getType() + " автомобиль с номером " + steps.getNumber() + " превысил " + message1 + "" + message2 + "" + message3 + "" + message4);
            }
        }
    }
}

package lesson11;

public class Runner {


    public static void main(String[] args) throws Exception {
        VehiclesGenerator v1 = new VehiclesGenerator();
        v1.generator();

        for (Vehicles steps : v1.getVehicles()) {
            try {
                if (steps.getSpeed() > 100) {
                    throw new Exception(" превысил скорость 100 км/ч. \t\t !!!Объявляем розыск!!!");
                }
            } catch (Exception a) {
                System.out.println( "Автомобиль с номером " + steps.getNumber() + " " +a.getMessage());
            }
            try {
                if (steps.getSpeed() > 80&steps.getSpeed() <100) {
                    throw new Exception(" превысил скорость 80 км/ч");
                }
            } catch (Exception b) {
                System.out.println( "Автомобиль с номером " + steps.getNumber() + " " +b.getMessage());
            }
            try {
                if (steps.getWeight() > 5000) {
                    throw new Exception(" превышает допустимую массу.");
                }
            } catch (Exception с) {
                System.out.println( "Автомобиль с номером " + steps.getNumber() + " " +с.getMessage());
            }
            try {
                if (steps.getHeight()>4 && steps.getWidth()>2.5) {
                    throw new Exception(" превышает допустимую высоту и ширину.");
                }
            } catch (Exception d) {
                System.out.println( "Автомобиль с номером " + steps.getNumber() + " " +d.getMessage());
            }
        }
    }
}
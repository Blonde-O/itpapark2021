package lesson11;

public class Runner1 {


    public static void main(String[] args) throws Exception {
        VehiclesGenerator v1 = new VehiclesGenerator();
        v1.generator();

        for (Vehicles steps : v1.getVehicles()) {
            try{
                if (steps.getSpeed() > 100) {
                    throw new Exception(" превысил скорость 100 км/ч. \t\t!!!Объявляем розыск!!!");
                }

                try {
                    if (steps.getSpeed() > 80 & steps.getSpeed() < 100) {
                        throw new Exception(" превысил скорость 80 км/ч");
                    }

                try {
                    if (steps.getWeight() > 5000) {
                        throw new Exception(" превышает допустимую массу ТС.");
                    }

                try {
                    if (steps.getHeight() > 4) {
                        throw new Exception(" превышает допустимую высоту ТС.");
                    }

                try {
                    if (steps.getWidth() > 2.5) {
                        throw new Exception(" превышает допустимую ширину ТС.");
                    }
                } catch (Exception c){
                    System.out.println("Автомобиль с номером " + steps.getNumber() +"" +c.getMessage());
                }
                }catch (Exception a){
                    System.out.println("Автомобиль с номером " + steps.getNumber() +"" +a.getMessage());
                }
                }catch (Exception b){
                    System.out.println("Автомобиль с номером " + steps.getNumber() +"" +b.getMessage()+ "");
                }
                }catch (Exception d){
                    System.out.println("Автомобиль с номером " + steps.getNumber() +"" +d.getMessage());
                }
                }catch (Exception f){
                    System.out.println("Автомобиль с номером " + steps.getNumber() +"" +f.getMessage());
                }
        }
    }
}
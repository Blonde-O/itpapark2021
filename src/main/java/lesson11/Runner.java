package lesson11;

import java.sql.SQLOutput;

public class Runner {


    public static void main(String[] args) throws Exception {
        String message1;
        String message2;
        String message3;
        String message4;

        VehiclesGenerator v1 = new VehiclesGenerator();
        v1.generator();


        for (Vehicles steps : v1.getVehicles()) {
            message1 = "";
            message2 = "";
            message3 = "";
            message4 = "";
            try {
                if (steps.getSpeed() > 100) {
                    throw new Exception(" превысил скорость 100 км/ч. \t\t !!!Объявляем розыск!!!");
                }

            } catch (Exception a) {
                message1 = a.getMessage();
                //System.out.println( "Автомобиль с номером " + steps.getNumber() + " " +a.getMessage());
            }
            try {
                if (steps.getSpeed() > 80&steps.getSpeed() <100) {
                    throw new Exception(" превысил скорость 80 км/ч");
                }
            } catch (Exception b) {
                message2 = b.getMessage();
                //System.out.println( "Автомобиль с номером " + steps.getNumber() + " " +b.getMessage());
            }
            try {
                if (steps.getWeight() > 5000) {
                    throw new Exception(" превышает допустимую массу.");
                }
            } catch (Exception с) {
                message3 = с.getMessage();
                //System.out.println( "Автомобиль с номером " + steps.getNumber() + " " +с.getMessage());
            }
            try {
                if (steps.getHeight()>4 && steps.getWidth()>2.5) {
                    throw new Exception(" превышает допустимую высоту и ширину.");
                }
            } catch (Exception d) {
                message4 = d.getMessage();
                //System.out.println( "Автомобиль с номером " + steps.getNumber() + " " +d.getMessage());
            }
            if(message1.equals("")&message2.equals("")&message3.equals("")&message4.equals("")){
                System.out.println("Автомобиль с номером " + steps.getNumber() + " может проехать через КПП!");
            }
            else {
                System.out.println("Автомобиль с номером " + steps.getNumber() + " " + message1 + " " + message2 + " " + message3 + " " + message4);
            }
        }
    }
}
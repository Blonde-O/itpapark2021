package lesson11;

public class Car extends Vehicles {

    @Override
    public String getType() {
        this.type = "Легковой";
        return super.getType();
    }

    public Car() {
    }

    public Car(int number, int speed, int weight, double height, double width, double length) {
        super(number, speed, weight, height, width, length);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}


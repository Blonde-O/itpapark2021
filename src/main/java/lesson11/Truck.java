package lesson11;

public class Truck extends Vehicles {

    @Override
    public String getType() {
        this.type = "Грузовой";
        return super.getType();
    }

    public Truck() {
    }

    public Truck(int number, int speed, int weight, double height, double width, double length) {
        super(number, speed, weight, height, width, length);

    }

    @Override
    public String toString() {
        return super.toString();
    }
}


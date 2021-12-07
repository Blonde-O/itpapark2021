package lesson11;

public class Car extends Vehicles {

    @Override
    public String toString() {
        return super.toString();
    }

    public Car() {
    }

    public Car(int number, int speed, int weight, double height, double width, double length) {
        super(number, speed, weight, height, width, length);
    }
}


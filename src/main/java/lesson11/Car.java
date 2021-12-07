package lesson11;

public class Car extends Vehicles{
    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "number=" + number +
                ", speed=" + speed +
                ", weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                '}';
    }

    public Car(int number, int speed, int weight, double height, double width, double length) {
        super(number, speed, weight, height, width, length);
    }
}


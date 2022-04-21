package lesson11.sources;

public class Car extends Vehicles {

    @Override
    public String getType() {
        this.type = "Легковой";
        return super.getType();
    }

    public Car() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


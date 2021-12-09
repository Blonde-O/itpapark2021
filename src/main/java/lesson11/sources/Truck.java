package lesson11.sources;

public class Truck extends Vehicles {

    @Override
    public String getType() {
        this.type = "Грузовой";
        return super.getType();
    }

    public Truck() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}


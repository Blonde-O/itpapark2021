package attempts.forclasses;

public class Vehicle {
    String category;
    int tankCapacity;
    int consumption;
    int distance;
    double reserve;
    int tankFullness;
    int refueling;

    Vehicle(int distance) {
        //this.category = category;
        this.distance = distance;
    }

    public void setTankFullness(int tankFullness) {
        this.tankFullness = tankFullness;
    }

    public int getRefueling() {
        return refueling;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getReserve() {
        return reserve;
    }

    public int getConsumption() {
        return consumption;
    }

    void determinationOfVehicle() {
        if ("мотоцикл".equals(this.category)) {
            tankCapacity = 15;
            consumption = 3;
        }
        if ("легковая".equals(this.category)) {
            tankCapacity = 50;
            consumption = 10;
        }
        if ("грузовая".equals(this.category)) {
            tankCapacity = 300;
            consumption = 20;
        }
    }

    void determinationOfFuel() {
        reserve = distance * consumption;
        reserve = reserve / 100;
        refueling = (int) Math.round ((reserve - tankCapacity * (tankFullness / 100)) / tankCapacity);
    }

}


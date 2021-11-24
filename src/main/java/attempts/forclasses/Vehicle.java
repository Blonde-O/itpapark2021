package attempts.forclasses;

public class Vehicle {
    String category;
    int tankCapacity;
    int consumption;
    int distance;

    public int getTankCapacity() {
        return tankCapacity;
    }

    public int getConsumption() {
        return consumption;
    }

    public Vehicle(String category, int distance) {
        this.category = category;
        this.distance = distance;
    }
    public void determinationOfVehicle(){
        if ("A".equals(this.category)){
           tankCapacity = 15;
           consumption = 3;
        }
        if ("B".equals(this.category)){
            tankCapacity = 50;
            consumption = 10;
        }
        if ("C".equals(this.category)){
            tankCapacity = 300;
            consumption = 20;
        }
    }

    }


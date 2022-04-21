package lesson9.sources;

public final class Truck extends Automobile {
    private static int counter = 0;

    public Truck() {
        this.range = 1200;
    }

    @Override
    public void move(int distance) {
        super.move(distance);
        counter += 1;
        if (distance <= range) {
            System.out.println("Грузовой автомобиль №" + counter + " проехал " + distance + " км.\t Вы можете проехать еще " + (range - distance) + " км.");
            return;
        }
        System.out.println("Грузовой автомобиль №" + counter + " проехал только " + this.range + " км.");
    }
}

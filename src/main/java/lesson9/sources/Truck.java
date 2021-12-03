package lesson9.sources;

public final class Truck extends Automobile {
    private int range;
    private static int counter =0;

    public Truck(int distance) {
        super(distance);
        this.range =1000;
    }

    @Override
    public void move(int distance) {
        super.move(distance);
        counter +=1;
        if (distance<=range){
        System.out.println("Грузовой автомобиль №" + counter + " проехал " + distance + " км.");
        return;
        }
        System.out.println("Грузовой автомобиль №" + counter + " проехал только " + range + " км.");
    }
}

package lesson9.sources;

public final class Car extends Automobile {
    private static int counter = 0;

    public Car() {
        this.range = 500;
    }

    @Override
    public void move(int distance) {
        super.move(distance);
        counter += 1;
        if (distance == range) {
            System.out.println("Легковой автомобиль №" + counter + " проехал " + distance + " км.");
            return;
        }
        if (distance < range) {
            System.out.println("Легковой автомобиль №" + counter + " проехал " + distance + " км.\t Вы можете проехать еще "
                    + (range - distance) + " км.");
            return;
        }
        String add = String.valueOf(((double) (distance - range) / range) * 100);
        System.out.println("Легковой автомобиль №" + counter + " проехал только " + this.range + " км. Чтобы проехать еще "
                + (distance - range) + " км. Вам надо заполнить бак на " + add + "%.");
    }
}

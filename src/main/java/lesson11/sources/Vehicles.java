package lesson11.sources;

public class Vehicles {
    protected int number;
    protected int speed;
    protected int weight;
    protected double height;
    protected String type;
    protected double width;
    protected double length;

    public Vehicles() {
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        return "ТС{" +
                "номер=" + number +
                ", скорость=" + speed +
                "км/ч, масса=" + weight +
                "т, высота=" + height +
                "м, ширина=" + width +
                "м, длина=" + length +
                "м}";
    }
}

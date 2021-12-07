package lesson11;

public class Vehicles {
    public int number;
    public int speed;
    protected int weight;
    protected double height;

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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    protected double width;
    protected double length;

    public Vehicles() {
    }

    protected Vehicles(int number, int speed, int weight, double height, double width, double length) {
        this.number = number;
        this.speed = speed;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
    }

    }

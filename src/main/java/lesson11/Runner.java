package lesson11;

public class Runner {


    public static void main(String[] args) {
        int n, s, w;
        double h, wi, l;
        Vehicles car1 = new Vehicles();
        Vehicles car2 = new Car();
        Vehicles car3 = new Car();
        Vehicles car4 = new Car();
        Vehicles car5 = new Car();
        Vehicles[] vehicles = new Vehicles[]{car1, car2, car3, car4, car5};
        for (Vehicles steps : vehicles) {
            steps.setNumber((int) (1000 - Math.random() * 1000));
            steps.setSpeed((int) (Math.random() * 200));
            steps.setWeight((int) (Math.random() * 8000));
            steps.setHeight(Math.ceil((1.5+Math.random() * 3)*Math.pow(10,2))/Math.pow(10,2));
            steps.setWidth(Math.random() * 1 + 2);
            steps.setLength(Math.random() * 12);
            System.out.println(steps);
        }

    }
}
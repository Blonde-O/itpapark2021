package lesson11;

public class Runner {


    public static void main(String[] args) {
        int n, s, w;
        double h, wi, l;
        Vehicles car1 = new Vehicles();
        car1.setNumber((int) (1000 - Math.random() * 1000));
        car1.setSpeed((int) (Math.random() * 101));
        car1.setWeight((int) (Math.random() * 8000));
        car1.setHeight(Math.random() * 5);
        car1.setWidth(Math.random() * 1+2);
        car1.setLength(Math.random() * 12);
        Vehicles car2 = new Car();
        Vehicles car3 = new Car();
        Vehicles car4 = new Car();
        Vehicles car5 = new Car();
        Vehicles[] vehicles = new Vehicles[]{car2, car3, car4, car5};
        for (Vehicles steps : vehicles) {
            steps.setNumber((int) (1000 - Math.random() * 1000));
            steps.setSpeed((int) (Math.random() * 101));
            steps.setWeight((int) (Math.random() * 8000));
            steps.setHeight(Math.random() * 5);
            steps.setWidth(Math.random() * 1+2);
            steps.setLength(Math.random() * 12);
            System.out.println(steps);
            System.out.println(steps.getNumber() + " " + steps.getSpeed());
        }
        System.out.println("________________");
        for (Vehicles steps : vehicles) {
            System.out.println(steps);

        }
        System.out.println("________________");
        System.out.println(car1);

    }
}

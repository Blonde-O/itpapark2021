package lesson7;

import java.util.Scanner;

public class RunAndSwimForKindsOfAnimals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя собаки");
        String dogName = in.nextLine();
        System.out.println("Введите имя кошки");
        String catName = in.nextLine();
        System.out.println("Введите имя тигра");
        String tigerName = in.nextLine();
        System.out.println("Введите имя рыбы");
        String fishName = in.nextLine();

        System.out.println("Введите дистанцию (м):");
        int distance = in.nextInt();

        Dog dog = new Dog(dogName, distance, distance);
        dog.runAndSwim();
        Cat cat = new Cat(catName, distance, distance);
        cat.runAndSwim();
        Tiger tiger = new Tiger(tigerName, distance, distance);
        tiger.runAndSwim();
        Fish fish = new Fish(fishName, distance, distance);
        fish.runAndSwim();
    }
}

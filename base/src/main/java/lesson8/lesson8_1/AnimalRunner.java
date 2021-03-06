package lesson8.lesson8_1;

import lesson8.lesson8_1.kindsOfAnimals.Bird;
import lesson8.lesson8_1.kindsOfAnimals.Cat;
import lesson8.lesson8_1.kindsOfAnimals.Cow;
import lesson8.lesson8_1.kindsOfAnimals.Dog;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal dog = new Dog("Мухтар");
        Animal cat = new Cat("Муся");
        Animal cow = new Cow("Дося");
        Animal bird = new Bird("Пигеон", "голубь");
        Animal bird1 = new Bird ("Каркарыч", "ворона");
        Animal bird2 = new Bird ("Андрей", "воробей");
        Animal bird3 = new Bird ("Скрудж", "утка");

        Animal[] animals = new Animal[]{dog, cat, cow, bird, bird1, bird2, bird3};
        for (Animal animal : animals) {
            System.out.print(animal.getKind() + " " + animal.getName() + " ");
            animal.makeVoice();
        }
    }
}

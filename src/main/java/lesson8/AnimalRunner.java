package lesson8;

public class AnimalRunner {

    public static void main(String[] args) {
        Animal dog = new Dog("Мухтар");
        Animal cat = new Cat("Муся");
        Animal cow = new Cow("Дося");
        Animal bird = new Bird ("Каркарыч");

        Animal[] animals = new Animal[]{dog, cat, cow, bird};
        for (Animal animal : animals) {
            System.out.print(animal.getKind() + " " + animal.getName() + " ");
            animal.makeVoice();
        }
    }
}

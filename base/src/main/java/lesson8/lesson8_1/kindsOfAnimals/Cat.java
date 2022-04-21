package lesson8.lesson8_1.kindsOfAnimals;

import lesson8.lesson8_1.Animal;

public class Cat extends Animal {

    String kind = "Кошка";

    public Cat(String name) {super(name);}

    public String getKind() {return this.kind;}

    @Override
    public void makeVoice() {
        setVoice("\"Мяу-мяу\"");
        super.makeVoice();
    }
}


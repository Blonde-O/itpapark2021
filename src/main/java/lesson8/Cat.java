package lesson8;

public class Cat extends Animal {

    String kind = "Кошка";

    public Cat(String name) {
        super(name);
    }

    public String getKind() {
        return kind;
    }

    @Override
    public void makeVoice() {
        setVoice("\"Мяу-мяу\"");
        super.makeVoice();
    }
}


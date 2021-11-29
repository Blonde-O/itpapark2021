package lesson8;

public class Dog extends Animal {
    String kind = "Собака";

    public Dog(String name) {super(name);}

    public String getKind() {return this.kind;}

    @Override
    public void makeVoice() {
        setVoice("\"Гав-гав\"");
        super.makeVoice();
    }
}

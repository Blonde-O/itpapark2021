package lesson8;

public class Bird extends Animal {
    String kind = "Птица";

    public Bird(String name) {
        super(name);
    }

    public String getKind() {
        return this.kind;
    }

    @Override
    public void makeVoice() {
        setVoice("\"Шик-ширык\"");
        super.makeVoice();
    }
}

package lesson8;

public class Cow extends Animal {

    String kind = "Корова";

    public Cow(String name) {super(name);}

    public String getKind() {return kind;}

    @Override
    public void makeVoice() {
        setVoice("\"Му-му\"");
        super.makeVoice();
    }
}
